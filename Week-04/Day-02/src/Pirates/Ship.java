package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> crew;

    public Ship() {
        this.crew = new ArrayList<>();
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

    public String shipState() {
        return "Captain's drunkness: " + captain.drinkSomeRum();

    }

    public boolean battle(Ship otherShip) {
        int shipScore = 3;
        int otherShipScore = 1;
        boolean thisShipWins;

        if (shipScore > otherShipScore) {
            thisShipWins = true;
        }


    }
}
