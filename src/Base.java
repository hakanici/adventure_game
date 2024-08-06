public class Base extends Locations{


    public Base(String name, Player player) {
        super("Base", player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in base. You'll be full health");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        return true;
    }
}
