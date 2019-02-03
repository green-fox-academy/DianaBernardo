package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4);
  }

  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = 5;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
