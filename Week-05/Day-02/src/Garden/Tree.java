package Garden;

public class Tree extends Plant {

    public Tree(int waterAmount, String color, String type) {
        super(waterAmount, color, type, 10, 0.4);
        }

    public void watering(int amount) {
        waterAmount += amount * absorption;
    }
}