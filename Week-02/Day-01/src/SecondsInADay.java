import java.util.concurrent.TimeUnit;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int HoursinSec = currentHours * 60 * 60;
        int MinutesinSec = currentMinutes * 60;
        int currentTime = HoursinSec + MinutesinSec + currentSeconds;
        int secsInDay = 24 * 60 * 60;

        System.out.println(secsInDay - currentTime);
    }
}
