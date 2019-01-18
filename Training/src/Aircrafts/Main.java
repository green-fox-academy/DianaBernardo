package Aircrafts;

public class Main {
  public static void main(String[] args) {

    F16 plane1 = new F16();
    F35 plane2 = new F35();
    F16 plane3 = new F16();
    F35 plane4 = new F35();
    F16 plane5 = new F16();
    F35 plane6 = new F35();

    Carrier carrier1 = new Carrier(1000, 2000);
    Carrier carrier2 = new Carrier(1500, 1500);

    carrier1.add(plane1);
    carrier1.add(plane2);
    carrier1.add(plane3);

    carrier2.add(plane4);
    carrier2.add(plane5);
    carrier2.add(plane6);

    System.out.println(carrier1.getStatus());
    System.out.println();
    System.out.println(carrier2.getStatus());
    System.out.println();
    System.out.println();
    System.out.println("The fight has been started ...");
    carrier1.fight(carrier2);
    System.out.println(carrier1.getStatus());
    System.out.println();
    System.out.println(carrier2.getStatus());
  }
}
