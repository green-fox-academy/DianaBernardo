package Garden;

public class Plant {

    int waterAmount;
    String color;
    boolean isThirsty;
    double wateringAmount;
    String type;
    int waterNeeded;
    double absorption;


    public Plant(int waterAmount, String color, String type, int waterNeeded, double absorption) {
        this.waterAmount = waterAmount;
        this.color = color;
        this.type = type;
        this.waterNeeded = waterNeeded;
        this.absorption = absorption;
    }

    public boolean isThirsty() {
      return waterAmount < waterNeeded;

    }

    public void watering(int amount) {
    waterAmount += amount * absorption;
    }

    public String status() {
        if (isThirsty()) {
            return "The " + color + " " + type + " needs water";
        } else {
            return "The " + color + " " + type + " doesnt need water";
        }
    }
}