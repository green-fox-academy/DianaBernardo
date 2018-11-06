import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList<String> women, ArrayList<String> men) {
        ArrayList<String> matches = new ArrayList<>();

        for (int i = 0; i < men.size()-1; i++) {
                matches.add(i*2, men.get(i));
                matches.add(i*2+1, women.get(i));
        }
        return matches;
    }
}
