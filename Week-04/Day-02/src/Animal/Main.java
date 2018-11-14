package Animal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal cow = new Animal();
        Animal pig = new Animal();

        dog.hunger = 100;
        dog.play();

        cow.hunger = 60;
        pig.hunger = 30;

        Farm animals = new Farm();
        animals.farm.add(dog);
        animals.farm.add(cat);
        animals.farm.add(cow);
        animals.farm.add(pig);

        animals.breed();
        animals.slaughter();
        animals.slaughter();

        System.out.println(animals);
        System.out.println("Slots:" + animals.slots);

    }
}
