public abstract class Equipments {
    private String name;
    private int id;
    private int cost;

    public Equipments(String name, int id, int cost){
        this.name=name;
        this.cost=cost;
        this.id=id;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
