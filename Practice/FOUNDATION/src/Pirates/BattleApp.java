package Pirates;

public class BattleApp {

  public static void main(String[] args) {
    Ship whale = new Ship();
    Ship shark = new Ship();

    whale.fillShip();
    shark.fillShip();

    System.out.println(shark.crew);
  }
}
