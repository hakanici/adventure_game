public class Weapons extends Equipments{
    private int damage;
    public Weapons(String name, int id, int cost,int damage) {
        super(name, id, cost);
        this.damage=damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
