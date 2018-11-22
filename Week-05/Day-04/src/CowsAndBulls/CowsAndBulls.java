package CowsAndBulls;

import java.util.Scanner;

public class CowsAndBulls {

  int goalToGuess;
  boolean playing;
  boolean finished;
  int guessCounter;

  public CowsAndBulls() {
    this.goalToGuess = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
    this.playing = true;
    this.finished = false;
    this.guessCounter = 0;
  }

  int userGuess;

  public void userInput() {
    System.out.println("Guess a four digit number");
    Scanner guess = new Scanner(System.in);
    userGuess = guess.nextInt();
    System.out.println("Your guess is the number " + userGuess);
  }

  public void compareNumbers(int goalToGuess) {
    String goalToString = Integer.toString(goalToGuess);
    String guessToString = Integer.toString(userGuess);
    for (int i = 0; i < goalToString.length(); i++) {
      if(goalToString.charAt(i) == guessToString.charAt(i)) {
        System.out.println("Cow!");
      }
      else if (guessToString.contains(goalToString.charAt(i) + "")) {
        System.out.println("Bull!");
      }
      else {
        System.out.println(" " + goalToString.charAt(i));
      }
    }
  }
  public void playGame() {
    userInput();
    compareNumbers(userGuess);
    if(userGuess == goalToGuess) {
      System.out.println("Well done, you won!");
      finished = true;
      playing = false;
    }
    else {
      playGame();
    }
  }
}
