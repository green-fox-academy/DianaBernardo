package Garden;

public class Main {
  public static void main(String[] args) {
    Flower blue = new Flower("blue");
    Flower yellow = new Flower("yellow");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");
    Garden myGarden = new Garden();

    myGarden.addPlant(blue);
    myGarden.addPlant(yellow);
    myGarden.addPlant(purple);
    myGarden.addPlant(orange);

    myGarden.checkWater();
    System.out.println();
    myGarden.waterGarden(40.0);
    System.out.println();
    myGarden.waterGarden(70.0);
  }
}
