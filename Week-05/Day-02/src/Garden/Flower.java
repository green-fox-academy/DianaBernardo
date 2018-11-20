package Garden;

public class Flower extends Plant {

    String type;

    public Flower(int waterAmount, String color, String type) {
        super(waterAmount, color, type);
        this.type = "Flower";
    }

    public void isThirsty(int waterAmount) {
        if (waterAmount < 5) {
            isThirsty = true;
        }
    }

    public void watering() {
        double waterGot = wateringAmount * 0.75;
        waterAmount += waterGot;
    }
}