package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super(6);
  }

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = 7;
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
