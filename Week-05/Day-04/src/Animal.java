public class Animal {

  int hunger = 50;
  int thirst = 50;

  public int eat() {
    return hunger -= 1;
  }

  public int drink() {
    return thirst -= 1;
  }


  public void play() {
    hunger += 1;
    thirst += 1;
  }
}