import java.util.Scanner;

public abstract class Locations {
    private String name;
    private Player player;
    public static Scanner sc=new Scanner(System.in);


    public Locations(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    abstract boolean onLocation();
}
