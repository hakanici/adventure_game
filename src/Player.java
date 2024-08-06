import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int gold;
    private String name;
    private String charName;
    private Inventory inv;
    private Locations locations;
    private int defaultHealth;

    private Scanner sc=new Scanner(System.in);

    public Player(String name){
        this.name=name;
        this.inv=new Inventory();
    }
    public int totalDamage(){
        return damage+getInv().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        if(health<0){
            health=0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectedChar(){
        Chars warrior=new Chars("Warrior",1,5,21,30);
        Chars ranger=new Chars("Ranger",2,7,18,20);
        Chars mage=new Chars("Mage",3,8,24,5);


        System.out.print("ID:"+warrior.getId()+"\t" +"Name:"+warrior.getName()+"\t" +"Damage:"+warrior.getDamage()+"\t" +"Health:"+warrior.getHealth()+"\t" +"Gold:"+warrior.getGold()+"\n");
        System.out.print("ID:"+ranger.getId()+"\t" +"Name:"+ranger.getName()+"\t" +"    "+"Damage:"+ranger.getDamage()+"\t" +"Health:"+ranger.getHealth()+"\t" +"Gold:"+ranger.getGold()+"\n");
        System.out.print("ID:"+mage.getId()+"\t" +"Name:"+mage.getName()+"\t" +"    "+"Damage:"+mage.getDamage()+"\t" +"Health:"+mage.getHealth()+"\t" +"Gold:"+mage.getGold()+"\n");
        System.out.println("-------------------------");
        System.out.print("Please select a character:");
        int selected= sc.nextInt();
        switch (selected){
            case 1:
                System.out.println("You are a "+warrior.getName());
                this.gold= warrior.getGold();
                this.health= warrior.getHealth();
                this.damage= warrior.getDamage();
                this.defaultHealth= warrior.getHealth();
                break;
            case 2:
                System.out.println("You are a "+ranger.getName());
                this.gold= ranger.getGold();
                this.health= ranger.getHealth();
                this.damage= ranger.getDamage();
                this.defaultHealth= ranger.getHealth();
                break;
            case 3:
                System.out.println("You are a "+mage.getName());
                this.gold=mage.getGold();
                this.health= mage.getHealth();
                this.damage= mage.getDamage();
                this.defaultHealth= mage.getHealth();
                break;
            default:
                System.out.println("You are a "+warrior.getName());
                this.gold= warrior.getGold();
                this.health= warrior.getHealth();
                this.damage= warrior.getDamage();
                this.defaultHealth= warrior.getHealth();
                break;
        }
    }


    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
    public void printInfo(){
        System.out.println("Weapon : " + getInv().getWeapon().getName() + ", Armor Type : " + getInv().getArmor().getName() + ", Armor : " + getInv().getArmor().getDodge() + ", Damage : " + this.totalDamage() + ", Health : " + this.getHealth() + ", Balance : " + this.getGold());
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}
