package Flyable;

public abstract class Vehicle {

    protected String name;
    protected int altitude;
    protected int passengers;

    public Vehicle (String name, int altitude, int passengers) {
        this.name = name;
        this.altitude = altitude;
        this.passengers = passengers;
    }

    public Vehicle() {
    }
}
