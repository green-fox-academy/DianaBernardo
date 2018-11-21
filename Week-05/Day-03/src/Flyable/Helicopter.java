package Flyable;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter (String name, int altitude , int passengers) {
        this.name = name;
        this.altitude = altitude;
        this.passengers = passengers;
    }


    @Override
    public String land() {
        return "The " + name + " with " + passengers + " passengers is now at altitude " + altitude;
    }

    @Override
    public String fly() {
        return "The helicopter " + name + " is flying with " + passengers + " passengers.";
    }

    @Override
    public String takeOff() {
        return "Taking off from altitude " + altitude;
    }
}
