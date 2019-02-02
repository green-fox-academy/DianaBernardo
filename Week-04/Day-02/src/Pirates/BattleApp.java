package Pirates;

public class BattleApp {
  public static void main(String[] args) {
    Ship shark = new Ship();
    Ship whale = new Ship();

    shark.fillShip();
    whale.fillShip();

    shark.getCaptain().drinkSomeRum(3);

    System.out.println(shark.toString());
    System.out.println(whale.toString());
    System.out.println(shark.battle(whale));
  }
}
