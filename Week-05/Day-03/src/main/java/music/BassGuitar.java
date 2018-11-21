package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar (int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;

    }

    public BassGuitar () {
        this.name = "Bass guitar";
        this.numberOfStrings = 4;
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
