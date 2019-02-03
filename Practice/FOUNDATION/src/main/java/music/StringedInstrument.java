package main.java.music;

public class StringedInstrument extends Instrument {

  int numberOfStrings;

  public StringedInstrument (int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {

  }

  public String sound() {
    return null;
  }

  @Override
  public void play() {
    System.out.println(getClass().getSimpleName() + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());;
  }
}
