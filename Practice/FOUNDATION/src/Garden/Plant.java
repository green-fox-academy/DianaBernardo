package Garden;

public class Plant {

  private String color;
  private double waterNeeded;
  private double absorption;
  private double waterAmount = 0.00;

  public Plant(String color, double waterNeeded, double absorption) {
    this.color = color;
    this.waterNeeded = waterNeeded;
    this.absorption = absorption;
  }

  public String getColor() {
    return color;
  }

  public double getWaterNeeded() {
    return waterNeeded;
  }

  public boolean needsWater() {
    return waterAmount < waterNeeded;
  }

  public void watering(double water) {
    waterAmount += water * absorption;
  }

  public String toString() {
    return "The " + getColor() + " " + getClass().getSimpleName() + (needsWater() ? " needs " : " doesnt need ") + "water";
  }
}
