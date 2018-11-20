package Garden;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Garden {

    int thirstyElements = 0;
    int water = 40;
    double wateringAmount = 0.0;

    List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public int thirsty(int waterAmount) {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).isThirsty) {
                thirstyElements++;
            }
        }
        return thirstyElements;
    }

    public void water() {
        int counter = 0;
        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).watering(water, thirstyElements);
        }
        counter++;
        if (counter == 1) {
            water = 70;
        }
    }

    public String status() {
        String string = "";
        for (int i = 0; i < plants.size(); i++) {
            string += plants.get(i).status() + "\n";
        }
        return string;
    }
}