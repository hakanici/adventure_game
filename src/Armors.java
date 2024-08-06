public class Armors extends Equipments{
    private int dodge;
    public Armors(String name, int id, int cost,int dodge) {
        super(name, id, cost);
        this.dodge=dodge;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
