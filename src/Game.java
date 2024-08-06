import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);

    public void gameStart() {

        System.out.print("Player Name : ");
        String name = sc.nextLine();
        System.out.println("Welcome to the Adventure Game " + name + "!");
        System.out.println();
        Player player = new Player(name);
        player.selectedChar();

        while (true) {
            player.printInfo();
            System.out.println("Where would you like to go?");
            System.out.println("1-Base");
            System.out.println("2-Shop");
            System.out.println("3-Cave");
            System.out.println("4-Forest");
            System.out.println("5-River");
            int selectedLoc = sc.nextInt();
            switch (selectedLoc) {
                case 1:
                    Base base = new Base(player.getName(), player);
                    base.onLocation();
                    break;
                case 2:
                    Shop shop = new Shop(player.getName(), player);
                    shop.onLocation();
                    break;
                case 3:
                    Cave cave=new Cave(player);
                    cave.onLocation();
                    break;
                case 4:
                    Forest forest=new Forest(player);
                    forest.onLocation();
                    break;
                case 5:
                    River river=new River(player);
                    river.onLocation();
                    break;
                default:
                    System.out.println("Not valid!");


            }




        }


    }
}
