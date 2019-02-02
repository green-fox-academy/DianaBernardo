package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  private List<Pirate> crew = new ArrayList<>();
  private Pirate captain;
  private String name;

  public void fillShip() {
    int randomNum = (int) (Math.random() * 5 + 1);
    for (int i = 0; i < randomNum; i++) {
      crew.add(new Pirate(false));
    }
    captain = new Pirate(true);
  }

  public String captainState() {
    String stateOfCaptain;
    if (captain.isAlive()) {
      stateOfCaptain = "alive";
    } else {
      stateOfCaptain = "dead";
    }
    return stateOfCaptain;
  }

  public int alivePirateCounter() {
    int counter = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive()) {
        counter++;
      }
    }
    return counter;
  }

  public int getScore() {
    return alivePirateCounter() - captain.getDrunkness();
  }

  public void win() {
    for (int k = 0; k < crew.size(); k++) {
      int rumAmount = (int) (Math.random() * 10 + 1);
      crew.get(k).drinkSomeRum(rumAmount);
    }
    captain.drinkSomeRum((int) (Math.random() * 10 + 1));
  }

  public void lose() {
    int deaths = (int) (Math.random() * crew.size() + 1);
    for (int l = 0; l < deaths; l++) {
      crew.get(l).die();
    }
  }

  public boolean battle(Ship opponentShip) {
    if (getScore() > opponentShip.getScore()) {
      win();
      opponentShip.lose();
      return true;
    } else {
      opponentShip.win();
      lose();
      return false;
    }
  }

  public Pirate getCaptain() {
    return captain;
  }

  public String getName() {
    return name;
  }

  public String toString() {

    String stringToReturn = "Ship " + getName() +
        "captain= number of consumed rum is " +
        captain.getDrunkness() +
        ", his state is  " +
        captainState() +
        ", number of alive pirates is " +
        alivePirateCounter();
    return stringToReturn;
  }

}
