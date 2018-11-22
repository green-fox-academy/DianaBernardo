/*package AircraftCarrier;

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


    void add(Aircraft newAircraft) {
        aircrafts.add(newAircraft);
    }

    public void fill() {

        for (Aircraft aircraft1 :
                aircrafts) {
            if (ammo > 0) {
                if (aircraft1.isPriority()) {
                    ammo -= aircraft1.getMaxAmmo() - aircraft1.getAmmoStore();
                    aircraft1.refill(ammo);
                    if (ammo <= 0) {
                        break;
                    }
                }
            }
        }

        for (Aircraft aircraft1 :
                aircrafts) {
            if (ammo > 0) {
                if (!aircraft1.isPriority()) {
                    ammo -= aircraft1.getMaxAmmo() - aircraft1.getAmmoStore();
                    aircraft1.refill(ammo);
                    if (ammo <= 0) {
                        break;
                    }
                }
            }
        }

}

    void fight(Carrier oponent) {
        for (Aircraft aircraft : aircrafts) {
            oponent.healthPoint -= aircraft.getAmmoStore() * aircraft.getBaseDamage();
        }
    }

    void getStatus() {
    int maxDamage = 0;
    if(healthPoint <= 0) {
        System.out.println("It's dead Jim :(");
    }
    else {
        for (Aircraft aircraft: aircrafts) {
            maxDamage += aircraft.getAmmoStore() * aircraft.getBaseDamage();
            aircraft.getstatus();
        }
        System.out.println("Type: " + getClass().getName() + " Aircraft count: " + aircrafts.size() + " Ammo storage: " + ammo + " Total damage: " + maxDamage);
    }
    }
}
*/