package Aircrafts;

public class Aircraft {

  private int ammoStore;
  private int baseDamage;
  private int maxAmmo;
  private boolean isPriority;

  public Aircraft (int maxAmmo, int baseDamage, boolean isPriority) {
    this.isPriority = isPriority;
    this.ammoStore = 0;
    this.maxAmmo = maxAmmo;
    this.isPriority = isPriority;
  }

  public int getAmmoStore() {
    return ammoStore;
  }

  public boolean getPriority() {
    return isPriority;
  }

  public int fight(Aircraft oponent) {
    int damage = baseDamage * ammoStore;
    ammoStore = 0;
    return damage;
  }

  public int refill(int number) {
    int temp = ammoStore;
    if (ammoStore == number) {
      return number;
    }
    if (number < maxAmmo - ammoStore) {
      ammoStore += number;
      return 0;
    }
    else {
      ammoStore = maxAmmo;
      return number - maxAmmo + temp;
    }
  }

  public String getType() {
    return getClass().getSimpleName();
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + "All Damage: " + (baseDamage*ammoStore);
  }
}
