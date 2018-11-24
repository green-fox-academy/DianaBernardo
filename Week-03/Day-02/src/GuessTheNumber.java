import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {

    int numberToGuess = (int) ((Math.random() * 100) + 1);

    int lives = 10;
    while (lives > 0) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number between 1 and 100. You have " + lives + " lives. Good luck!");
      int userGuess = scanner.nextInt();
      if (userGuess > numberToGuess) {
        lives--;
        System.out.println("Too high! Try with a lower number. You have now " + lives + " lives left.");
      } else if (userGuess < numberToGuess) {
        lives--;
        System.out.println("Too low! Try with a higher number. You have now " + lives + " lives left.");
      } else if (userGuess == numberToGuess){
        System.out.println("Congratulations, you won!");
      }
      else if (lives == 0) {
        System.out.println("You lost. Better luck next time!");
      }
    }
  }
}
