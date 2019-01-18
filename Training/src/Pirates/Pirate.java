package Pirates;

public class Pirate {
  private int drunkness;
  private int methodCall;
  private boolean sleeping;
  private boolean isAlive = true;


  public void drinkSomeRum(int rumAmount) {
    drunkness++;
    methodCall++;
  }

  public void howsItGoingMate() {
    if (methodCall <=4) {
      System.out.println("Pour me anudder!");
    }
    else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      sleeping = true;
    }
  }

  public void die() {
    isAlive = false;
  }

  public void brawl (Pirate oponent) {
    if (!oponent.isAlive) {
      System.out.println("You cannot fight the dead!");
    }
    else {
      int fightResult = (int) Math.floor(Math.random() * 3);
      if(fightResult == 0) {
        this.isAlive = false;
        System.out.println("Sorry mate, you died");
      }
      else if(fightResult == 1) {
        oponent.isAlive = false;
        System.out.println("Weel done, pirate! You killed the enemy!");
      }
      else if(fightResult == 2) {
        this.sleeping = true;
        oponent.sleeping = true;
        System.out.println("The sleep of the drunk.");
      }
    }
  }
  public boolean isAlive() {
    return isAlive;
  }

  public int getDrunkness() {
    return drunkness;
  }
}
