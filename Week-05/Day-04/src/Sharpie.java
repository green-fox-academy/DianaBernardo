public class Sharpie {
  String color;
  Double width;
  Double inkAmount = 100.00;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }

  public double use(){
    return inkAmount-=1;
  }
}