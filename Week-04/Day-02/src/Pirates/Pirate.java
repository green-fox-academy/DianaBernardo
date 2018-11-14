package Pirates;

public class Pirate {

    int methodcalled = 0;
    boolean sleeping = false;
    boolean alive = true;


    public int drinkSomeRum() {
        int drunkState = 0;
        drunkState++;
        methodcalled++;
        return drunkState;
    }


    public void howsItGoingMate() {
        if(!alive){
        }
        if (methodcalled <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            sleeping = true;
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate pirateFighter) {
        int fightresult = (int) Math.floor(Math.random() * 3);

        switch (fightresult) {
            case 0:
                pirateFighter.alive = false;
                break;
            case 1:
                this.alive = false;
                break;
            case 2:
                this.sleeping = true;
                pirateFighter.sleeping = true;
                break;
        }
    }

    @Override
    public String toString() {
        return "Pirate alive: " + alive;
    }
}
