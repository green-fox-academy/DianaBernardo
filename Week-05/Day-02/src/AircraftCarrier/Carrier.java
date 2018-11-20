package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    int ammoStore;
    int healthPoint;

    public Carrier(int ammoStore, int healthPoint) {
        this.ammoStore = ammoStore;
        this.healthPoint = healthPoint;
    }

    List<Aircraft> aircrafts;

    public Carrier() {
        aircrafts = new ArrayList<>();
    }

    public List<Aircraft> aircrafts(Aircraft aircraft) {
        aircrafts.add(aircraft);
        return aircrafts;
    }

    public void fill() {
        try {
            int totalAmmoNeeded = 0;
            for (int i = 0; i < aircrafts.size(); i++) {
                totalAmmoNeeded += aircrafts.get(i).ammoNeeded;

                if(totalAmmoNeeded <= ammoStore) {
                    aircrafts.get(i).refill(300);
                    ammoStore -= totalAmmoNeeded;
                }
                else {
                    if(aircrafts.get(i).isPriority) {
                        aircrafts.get(i).refill(300);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("There are not enough ammos");
        }
    }

    public void fight(Carrier oponent) {
        this.ammoStore = 0;
        healthPoint -= AllDamage;
    }
}
