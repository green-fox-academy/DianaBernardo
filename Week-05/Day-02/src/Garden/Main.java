package Garden;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.plants.add(new Flower(0, "yellow", "Flower"));
        garden.plants.add(new Flower(0, "blue", "Flower"));
        garden.plants.add(new Tree(0, "purple", "Tree"));
        garden.plants.add(new Tree(0, "orange", "Tree"));

        System.out.println(garden.status());

        garden.waterGarden(40);

        System.out.println(garden.status());

      garden.waterGarden(70);

      System.out.println(garden.status());
    }
}