import java.util.Scanner;

public class Shop extends Locations {
    Scanner sc = new Scanner(System.in);

    public Shop(String name, Player player) {
        super("Shop", player);
    }

    Weapons sword = new Weapons("Sword", 1, 25, 2);
    Weapons axe = new Weapons("Axe", 2, 35, 3);
    Weapons staff = new Weapons("Staff", 3, 45, 7);

    Armors cloth = new Armors("Cloth", 1, 15, 1);
    Armors leather = new Armors("Leather", 2, 30, 2);
    Armors plate = new Armors("Plate", 3, 50, 5);

    int newBalance;


    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the shop! What do u want ? ");
        System.out.println("1-Weapon");
        System.out.println("2-Shield");
        System.out.println("3-Exit");
        int select = sc.nextInt();
        while (select < 1 || select > 3) {
            System.out.println("enter a valid value!");
        }

        switch (select) {
            case 1:
                showWeapons();
                buyWeapon();
                break;
            case 2:
                showArmors();
                buyArmor();
                break;
            case 3:
                System.out.println("See you later");
                return true;
        }

        return true;
    }

    public void showWeapons() {

        System.out.println("ID: " + sword.getId() + " Name: " + sword.getName() + " Damage: " + sword.getDamage() + " Cost: " + sword.getCost());
        System.out.println("ID: " + axe.getId() + " Name: " + axe.getName() + " Damage: " + axe.getDamage() + " Cost: " + axe.getCost());
        System.out.println("ID: " + staff.getId() + " Name: " + staff.getName() + " Damage: " + staff.getDamage() + " Cost: " + staff.getCost());
    }

    public void showArmors() {


        System.out.println("ID: " + cloth.getId() + " Name: " + cloth.getName() + " Dodge: " + cloth.getDodge() + " Cost: " + cloth.getCost());
        System.out.println("ID: " + leather.getId() + " Name: " + leather.getName() + " Dodge: " + leather.getDodge() + " Cost: " + leather.getCost());
        System.out.println("ID: " + plate.getId() + " Name: " + plate.getName() + " Dodge: " + plate.getDodge() + " Cost: " + plate.getCost());
    }

    public void buyWeapon() {
        System.out.println("Current balance: " + getPlayer().getGold());
        System.out.print("Your choice is: ");
        int selectedWeaponByID = sc.nextInt();
        if (selectedWeaponByID == sword.getId()) {
            if (this.getPlayer().getGold() >= sword.getCost()) {
                getPlayer().getInv().setWeapon(sword);
                newBalance = getPlayer().getGold() - sword.getCost();
                System.out.println("You got a Sword. New Balance:  " + newBalance);
                this.getPlayer().setGold(newBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
        if (selectedWeaponByID == axe.getId()) {
            if (this.getPlayer().getGold() >= axe.getCost()) {
                getPlayer().getInv().setWeapon(axe);
                newBalance = getPlayer().getGold() - axe.getCost();
                System.out.println("You got a Axe. New Balance:  " + newBalance);
                this.getPlayer().setGold(newBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
        if (selectedWeaponByID == staff.getId()) {
            if (this.getPlayer().getGold() >= staff.getCost()) {
                getPlayer().getInv().setWeapon(staff);
                newBalance = getPlayer().getGold() - staff.getCost();
                System.out.println("You got a Staff. New Balance:  " + newBalance);
                this.getPlayer().setGold(newBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public void buyArmor() {
        System.out.println("Current balance: " + getPlayer().getGold());
        System.out.print("Your choice is: ");
        int selectedArmorByID = sc.nextInt();
        if (selectedArmorByID == cloth.getId()) {
            if (this.getPlayer().getGold() >= cloth.getCost()) {
                getPlayer().getInv().setArmor(cloth);
                newBalance = getPlayer().getGold() - cloth.getCost();
                System.out.println("You got a Cloth. New Balance:  " + newBalance);
                this.getPlayer().setGold(newBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        if (selectedArmorByID == leather.getId()) {
            if (this.getPlayer().getGold() >= leather.getCost()) {
                getPlayer().getInv().setArmor(leather);
                newBalance = getPlayer().getGold() - leather.getCost();
                System.out.println("You got a Leather. New Balance:  " + newBalance);
                this.getPlayer().setGold(newBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
        if (selectedArmorByID == plate.getId()) {
            if (this.getPlayer().getGold() >= plate.getCost()) {
                getPlayer().getInv().setArmor(plate);
                newBalance = getPlayer().getGold() - plate.getCost();
                System.out.println("You got a Plate. New Balance:  " + newBalance);
                this.getPlayer().setGold(newBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}
