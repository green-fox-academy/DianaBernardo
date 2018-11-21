package main.java.music;

public class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument (String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument() {

    }

    public String sound() {
        return null;
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
