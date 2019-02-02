package Pirates;

public class Pirate {

    private String name;
    private int rumCounter = 0;
    private boolean sleeping = false;
    private boolean alive = true;
    private int drunkness = 0;
    private boolean captain;

  public Pirate(boolean captain) {
    this.captain = captain;
  }

  public void drinkSomeRum(int rumAmount) {
      if(!alive) {
        System.out.println("The pirate is dead. RIP.");
      }
      drunkness += rumAmount;
    }

    public void howsItGoingMate() {
        if(!alive){
          System.out.println("The pirate is dead. RIP.");
        }
        if (drunkness <= 4) {
            System.out.println("Pour me anudder!");
            drinkSomeRum(1);
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            sleeping = true;
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate pirateFighter) {
      if (!pirateFighter.isAlive()) {
        System.out.println("You cannooooot brawl with a dead pirate!");
        return;
      }
      int chance = (int) (Math.random() * 3 + 1);
      if (chance == 1) {
        die();
      } else if (chance == 2) {
        pirateFighter.die();
      } else {
        die();
        pirateFighter.die();
      }
    }


  public boolean isAlive() {
    return alive;
  }

  public int getDrunkness() {
    return drunkness;
  }

  public boolean isCaptain() {
    return captain;
  }

  @Override
    public String toString() {
        return "Pirate alive: " + alive;
    }
}
