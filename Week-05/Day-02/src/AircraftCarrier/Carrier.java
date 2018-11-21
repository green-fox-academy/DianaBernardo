package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private int ammo;
    private int healthPoint;

    private int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammoToFill) {
        while (this.ammo > 0) {
            for (Aircraft aircraft1 : aircrafts) {
                aircraft1.refill();
            }
        }
    }

    List<Aircraft> aircrafts;

    public Carrier(int ammo, int healthPoint) {
        this.ammo = ammo;
        this.healthPoint = healthPoint;
        aircrafts = new ArrayList<>();
    }
}

    /*
    void add(Aircraft newAircraft) {
        aircrafts.add(newAircraft);
    }

    public void fill(int ammo) {



        for (Aircraft aircraft1 :
                aircrafts) {
            if (ammo > 0 && this.ammo > 0) {
                try {
                    if (aircraft1.isPriority()) {

                    }

                }
            }
        }
    }
}
       /* try {
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

        */