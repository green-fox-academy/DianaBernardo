package Garden;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Garden {

  int thirstyElements;
  int water;

  List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public int getThirstyElements() {
    return thirstyElements;
  }

  public int thirsty(int waterAmount) {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).isThirsty) {
        thirstyElements++;
      }
    }
    return thirstyElements;
  }


  public void waterGarden(int amount) {
    List<Plant> needingWater = new ArrayList<>();
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).isThirsty()) {
        needingWater.add(plants.get(i));
      }
    }
    amount /= needingWater.size();
    for (Plant plant :
        needingWater) {
      plant.watering(amount);
    }
  }

    public String status () {
      String string = "";
      for (int i = 0; i < plants.size(); i++) {
        string += plants.get(i).status() + "\n";
      }
      return string;
    }
  }