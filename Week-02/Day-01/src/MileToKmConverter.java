import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        double miles = userInput1 * 0.621371192;

        System.out.println("You entered " + userInput1 + " kms, or " + miles + " miles.");
    }
}
