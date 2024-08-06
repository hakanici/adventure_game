public class Creatures{

    private String name;
    private int id;
    private int damage;
    private int health;
    private int awards;
    private int defaultHealth;


    public Creatures(String name, int id, int damage, int health,int awards) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.awards=awards;
        this.defaultHealth=health;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}

