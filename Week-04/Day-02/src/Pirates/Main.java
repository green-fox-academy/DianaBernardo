package Pirates;

public class Main {

    public static void main(String[] args){

    Pirate Joe = new Pirate();
    Pirate Jack = new Pirate();
    Pirate Jones = new Pirate();

    Ship ship1 = new Ship();
    ship1.shipName = "Shark";
    ship1.fillShip();
    System.out.println(ship1);

    Ship ship2 = new Ship();
    ship2.shipName = "Whale";
    ship2.fillShip();
    System.out.println(ship2);

    ship1.battle(ship2);
    System.out.println(ship1);
    System.out.println(ship2);

    }
}
