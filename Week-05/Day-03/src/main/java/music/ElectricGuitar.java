package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar (int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;

    }

    public ElectricGuitar () {
        this.name = "Electric guitar";
        this.numberOfStrings = 6;
    }

    @Override
    public String sound() {
        return "Twang";
    }
}
