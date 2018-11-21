package AircraftCarrier;

public class Aircraft {

    private int ammoStore;
    private int maxAmmo;
    private int baseDamage;
    public boolean priority;

    public int getAmmoStore() {
        return ammoStore;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public Aircraft (int ammoStore, int maxAmmo, int baseDamage, boolean priority) {
        this.ammoStore = ammoStore;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.priority = priority;
    }

    public int fight() {
        ammoStore = 0;
        int Alldamage = baseDamage * ammoStore;
        return Alldamage;
    }

    public void refill() {
        ammoStore = maxAmmo;
    }

    private String getType() {
        return getClass().getSimpleName();
    }


    public void getstatus() {
        System.out.println ("Type:" + getType() + ", Ammo:" + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * ammoStore);
    }

    boolean isPriority() {
        return priority;
    }
}
