package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    List<Pirate> crew;
    String shipName;
    boolean winner;

    public Ship() {
        this.crew = new ArrayList<>();
        this.shipName = shipName;

    }


    Pirate captain = new Pirate();

    public void fillShip() {
        crew.add(captain);

        int numberOfPirates = 0;
        for (int j = 0; j < (Math.floor(Math.random()) * 100); j++) {
            crew.add(new Pirate());
            numberOfPirates++;
        }
    }

    public int numberAlivePirates() {
        int alivePirates = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (!crew.get(i).alive) {
                alivePirates++;
            }
        }
        return alivePirates;
    }

    public int rumCaptain() {
        return captain.drunkness;
    }

    public int score() {
        return this.numberAlivePirates() - this.rumCaptain();
    }

    public boolean battle(Ship otherShip) {
        if (score() > otherShip.score()) {
            System.out.println(this.shipName + " is the winner!");

            Random random = new Random();
            int random2 = random.nextInt(crew.size());
            for (int i = 0; i < random2; i++) {
                otherShip.crew.get(i).alive = false;
            }
            for (int i = 0; i < random2; i++) {
                this.crew.get(i).drinkSomeRum();
            }
            return this.winner = true;
        } else {
            System.out.println(otherShip.shipName + " is the winner!");
            Random random = new Random();
            int random3 = random.nextInt(otherShip.crew.size());
            for (int i = 0; i < random3; i++) {
                this.crew.get(i).alive = false;
            }
            for (int i = 0; i < random3; i++) {
                otherShip.crew.get(i).drinkSomeRum();
            }
            return otherShip.winner = true;
        }
    }

    @Override
    public String toString() {
        return "Ship " + shipName + ": The crew has " + crew.size() + " pirates, of whom " + numberAlivePirates() + " are alive. The captain has drunk " + captain.drunkness;
    }
}
