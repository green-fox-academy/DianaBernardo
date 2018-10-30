import java.util.concurrent.TimeUnit;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secondsInADay = 24 * 60 * 60;
        int remainingHours = 24 - currentHours;
        int remainingMinutes = 60 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;

        int remainingHoursinSec = remainingHours * 60 * 60;
        int remainingMinsinSec = remainingMinutes * 60;

        int timeLeft = remainingHoursinSec + remainingMinutes + remainingSeconds;

        System.out.println(timeLeft);
    }
}
