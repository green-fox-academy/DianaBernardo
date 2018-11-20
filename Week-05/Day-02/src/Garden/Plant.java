package Garden;

public class Plant {

    int waterAmount = 0;
    String color;
    boolean isThirsty;
    double wateringAmount = 0.0;
    String type;
    int water = 40;


    public Plant(int waterAmount, String color, String type) {
        this.waterAmount = waterAmount;
        this.color = color;
    }

    public void isThirsty() {
    }

    public void watering(int water, int thirstyElements) {
        wateringAmount = (double) water / thirstyElements;
    }

    public String status() {
        if (isThirsty) {
            return "The " + color + " " + type + " needs water";
        } else {
            return "The " + color + " " + type + " doesnt need water";
        }
    }
}