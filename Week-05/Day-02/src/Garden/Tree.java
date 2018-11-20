package Garden;

public class Tree extends Plant {

    public Tree(int waterAmount, String color, String type) {
        super(waterAmount, color, type);
        this.type = "Tree";
    }

    public void isThirsty(int waterAmount) {
        if (waterAmount < 10) {
            isThirsty = true;
        }
    }

    public void watering() {
        double waterGot = wateringAmount * 0.4;
        waterAmount += waterGot;
    }
}