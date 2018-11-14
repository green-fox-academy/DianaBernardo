package Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> farm;

    public Farm() {
        this.farm = new ArrayList<Animal>();
    }

    int slots = 5;

    public void breed() {
        if (slots > farm.size()) {
            farm.add(new Animal());
        }
        slots--;
    }

    public void slaughter() {
        int leastHungry = 0;


        for (int i = 0; i < farm.size(); i++) {
            if (farm.get(i).hunger < leastHungry) {
                leastHungry = farm.get(i).hunger;
            }
            farm.remove(leastHungry);
        }
        slots++;

    }

    @Override
    public String toString() {
        return "Farm:" + farm;
    }
}