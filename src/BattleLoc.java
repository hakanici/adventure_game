import java.util.Random;

public abstract class BattleLoc extends Locations {

    private Creatures creature;
    private String award;
    private int maxCreature;

    public BattleLoc(String name, Player player, Creatures creature, String award, int maxCreature) {
        super(name, player);
        this.creature = creature;
        this.award = award;
        this.maxCreature = maxCreature;
    }

    @Override
    boolean onLocation() {
        int creaturesCount = randomCreatures();
        System.out.println("Be Careful! " + this.getName() + " it's a Dangerous zone");
        System.out.println(creaturesCount + " " + this.getCreature().getName() + " creature might appear here. ");
        System.out.print("<B>attle or <E>scape : ");
        String selectCase = sc.nextLine().toUpperCase();
        if (selectCase.equals("B")) {
            if(combat(creaturesCount)){
                System.out.println("There is no enemies left in "+ this.getName());
                return true;
            }
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("You dead!");
            System.exit(0);
            return false;

        }

        return true;
    }

    public boolean combat(int creaturesCount) {
        for (int i = 1; i <= creaturesCount; i++){
            this.getCreature().setHealth(this.getCreature().getDefaultHealth());
            playerStats();
            creatureStats();

            while (this.getPlayer().getHealth()>0 && this.getCreature().getHealth()>0){
                System.out.print("<H>it or <E>scape");
                String selectCombat=sc.nextLine().toUpperCase();
                if(selectCombat.equals("H")){
                    System.out.println("You hit the target");
                    creature.setHealth(this.getCreature().getHealth()-this.getPlayer().totalDamage());
                    afterHit();
                    if(this.getCreature().getHealth()>0){
                        System.out.println();
                        System.out.println("Target hit you");
                        int creatureDamage=this.getCreature().getDamage()-this.getPlayer().getInv().getArmor().getDodge();
                        if(creatureDamage<0){
                            creatureDamage=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-creatureDamage);
                        afterHit();
                    }
                }else {
                    return false;
                }
            }
            if(this.getCreature().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Target is dead");
                System.out.println("You got "+ this.getCreature().getAwards()+" gold");
                this.getPlayer().setGold(this.getPlayer().getGold()+this.getCreature().getAwards());
                System.out.println("New Balance : "+ this.getPlayer().getGold());
            }else {
                return false;
            }
        }


            return true;
    }
    public void afterHit(){
        System.out.println("Your Health : " +this.getPlayer().getHealth());
        System.out.println("Target's Health : " +this.getCreature().getHealth());
        System.out.println();

    }
    public void playerStats(){
        System.out.println("Player Stats");
        System.out.println("-----------------------");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInv().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().totalDamage());
        System.out.println("Armor Type : " + this.getPlayer().getInv().getArmor().getName());
        System.out.println("Armor : " + this.getPlayer().getInv().getArmor().getDodge());
        System.out.println("Balance : " + this.getPlayer().getGold());
    }
    public void creatureStats(){
        System.out.println(this.getCreature().getName()+ " Stats");
        System.out.println("-----------------------");
        System.out.println("Health : " + this.getCreature().getHealth());
        System.out.println("Damage : " + this.getCreature().getDamage());
        System.out.println("Award : " + this.getCreature().getAwards());
    }

    public Creatures getCreature() {
        return creature;
    }

    public void setCreature(Creatures creature) {
        this.creature = creature;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int randomCreatures() {
        Random random = new Random();
        return random.nextInt(this.getMaxCreature()) + 1;
    }

    public int getMaxCreature() {
        return maxCreature;
    }

    public void setMaxCreature(int maxCreature) {
        this.maxCreature = maxCreature;
    }
}
