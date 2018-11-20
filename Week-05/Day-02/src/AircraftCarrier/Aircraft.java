package AircraftCarrier;

public class Aircraft {

    int ammoStore;
    int maxAmmo;
    int baseDamage;
    String type;
    int refillAmmo = 300;
    boolean isPriority;
    int ammoNeeded;

    public Aircraft (int ammoStore, int maxAmmo, int baseDamage, String type, boolean isPriority, int ammoNeeded) {
        this.ammoStore = ammoStore;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.type = type;
        this.isPriority = isPriority;
        this.ammoNeeded = ammoNeeded;
    }

    public int fight() {
        ammoStore = 0;
        int Alldamage = baseDamage * ammoStore;
        return Alldamage;
    }

    public int refill(int refillAmmo) {
        while(ammoStore < maxAmmo){
            ammoStore++;
        }
        int remainingAmmo = refillAmmo - maxAmmo;
        return remainingAmmo;
    }

    public String getstatus() {
        String status = "Type:" + type + ", Ammo:" + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: ";
        System.out.println(status);
        return status;
    }
}
