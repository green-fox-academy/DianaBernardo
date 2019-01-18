package Aircrafts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrier {

  List<Aircraft> carrier;
  private int storeOfAmmo;
  private int healthPoint;

  public Carrier(int storeOfAmmo, int healthPoint) {
    this.carrier = new ArrayList<>();
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill() throws Exception {
    if (storeOfAmmo <= 0) {
      throw new Exception("There is no ammo in store");
      }
      else {
        carrier.sort(Comparator.comparing(Aircraft::getPriority));
      for (int i = carrier.size(); i >= 0 && storeOfAmmo > 0 ; i--) {
        int temp = storeOfAmmo;
        storeOfAmmo = carrier.get(i).refill(temp);
      }
    }
  }

  public int totalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : carrier) {
      totalDamage += aircraft.getBaseDamage() * aircraft.getAmmoStore();
    }
    return totalDamage;
  }

  public void fight(Carrier enemy) {
    enemy.healthPoint -= totalDamage();
    for (Aircraft aircraft: carrier) {
      aircraft.fight(aircraft);
    }
  }

  public String getStatus() {
    return "Type: " + getClass().getName() + " Aircraft count: " + carrier.size() + " Ammo storage: " + storeOfAmmo + " Total damage: " + totalDamage();
  }
}
