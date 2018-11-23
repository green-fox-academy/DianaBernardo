// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {
  public static void main(String[] args) {
    double length = 8.00;
    double height = 6.00;
    double width = 5.00;

    double surface = 2 * (length*height) + (height*width) + (length*width);
    double volume = length * height * width;

    System.out.println(surface);
    System.out.println(volume);
  }
}
