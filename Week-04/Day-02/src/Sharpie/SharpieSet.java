package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {



    List<Sharpie> sharpieset;

    public SharpieSet(){
        this.sharpieset = new ArrayList<Sharpie>();
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpieset.size(); i++) {
            if (sharpieset.get(i).inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int removeTrash() {
        int trash = 0;
        for (int j = 0; j < sharpieset.size(); j++) {
            if (sharpieset.get(j).inkAmount < 0) {
                trash++;
            }
        }
        return trash;
    }
}