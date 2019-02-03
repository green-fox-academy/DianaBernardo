package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> myGarden = new ArrayList<>();

  public void addPlant(Plant plant) {
    myGarden.add(plant);
  }

  public void waterGarden(double water) {
    int counter = 0;
    for (Plant plant: myGarden) {
      if (plant.needsWater()) {
        counter++;
      }
    }
    for (Plant plant: myGarden) {
      if(plant.needsWater()) {
        plant.watering(water / counter);
      }
    }
    checkWater();
  }

  public void checkWater() {
    for (Plant plant : myGarden) {
      System.out.println(plant.toString());
    }
  }
}
