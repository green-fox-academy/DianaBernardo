// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        Path filePath = Paths.get("./log");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);

        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error!");
        }
        System.out.println(ip(lines));
        System.out.println(getPostRatio(lines));
    }

    public static List<String> ip(List<String> lines) {
        List<String> ips = new ArrayList<String>();

        for (int i = 0; i < lines.size(); i++) {
            String ip = lines.get(i).split("\\s+")[5];
            if (!ips.contains(ip)) {
                ips.add(ip);
            }
        }
        System.out.println(ips);
        return null;
    }

    public static float getPostRatio(List<String> lines) {
        int getCount = 0;
        int postCount = 0;
        String getPost = new String();

        for (int i = 0; i < lines.size() ; i++) {
            if(lines.get(i).split("\\s+")[6].equals("GET")) {
                getCount++;
            }
            if (lines.get(i).split("\\s+")[6].equals("POST")) {
                postCount++;
            }
        }
        return (float) getCount / postCount;
    }
}
