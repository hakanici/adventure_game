public class Inventory {
    private Weapons weapon;
    private Armors armor;

    public Inventory(){
        this.weapon=new Weapons("Default",0,0,0);
        this.armor=new Armors("Default",0,0,0);
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armors getArmor() {
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }
}
