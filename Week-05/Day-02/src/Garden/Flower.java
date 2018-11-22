package Garden;

public class Flower extends Plant {

    String type;

    public Flower(int waterAmount, String color, String type) {
        super(waterAmount, color, type, 5, 0.75);
}

    public void watering() {
        double waterGot = wateringAmount * absorption;
        waterAmount += waterGot;
    }
}