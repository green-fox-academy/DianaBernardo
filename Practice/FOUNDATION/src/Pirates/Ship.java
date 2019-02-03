package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  List<Pirate> crew;
  private Pirate captain;


  public void fillShip() {
    crew = new ArrayList<>();
    for (int i = 0; i < (Math.floor(Math.random()) * 51); i++) {
      crew.add(new Pirate());
    }
    captain = new Pirate();
  }

  public int captainRum() {
    return captain.getDrunkness();
  }

  public String captainStatus() {
    String stateOfCaptain;
    if (captain.isAlive()) {
      stateOfCaptain = "The captain is alive and has drunk " + captainRum() + "rum";
    }
    else {
      stateOfCaptain = "The captain is dead.";
    }
    return stateOfCaptain;
  }

  public int countAlivePirates() {
    int alivePirates = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive()) {
        alivePirates++;
      }
    }
    return alivePirates;
  }

  public int score() {
    return countAlivePirates() - captainRum();
  }

  public void battle(Ship enemy) {
    if(score() > enemy.score()) {
      win();
      enemy.lose();
      System.out.println("Congratulations, you won the battle.");
    }
    else if (enemy.score() > score()) {
      System.out.println("Work harder next time...");
      this.lose();
      enemy.win();
    }
  }

  public void win() {
    for (int i = 0; i < crew.size(); i++) {
      int rumAmount = (int) (Math.random() * 10 + 1);
      crew.get(i).drinkSomeRum(rumAmount);
    }
      captain.drinkSomeRum((int) (Math.random() * 10 + 1));
  }

  public void lose() {
    for (int i = 0; i < crew.size(); i++) {
      int deaths = (int) (Math.random() * 10 + 1);
      crew.get(i).die();
    }
  }
  public String toString() {
    StringBuilder stringToReturn = new StringBuilder();
    stringToReturn.append("Ship");
    stringToReturn.append("captain= number of consumed rum is ");
    stringToReturn.append(captain.getDrunkness());
    stringToReturn.append(", his state is  ");
    stringToReturn.append(captainStatus());
    stringToReturn.append(", number of alive pirates is ");
    stringToReturn.append(countAlivePirates());

    return stringToReturn.toString();
  }
}

