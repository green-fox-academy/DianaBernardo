package Flyable;

public class Main {
    public static void main(String[] args) {

        Helicopter heli = new Helicopter("Heli1", 0, 5);
        System.out.println(heli.takeOff());
        System.out.println(heli.fly());
        System.out.println(heli.land());
    }
}
