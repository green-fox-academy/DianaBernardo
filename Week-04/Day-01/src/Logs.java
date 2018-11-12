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
    public static void main(String[] args){

        Path filePath = Paths.get("https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/file-manipulations/logs/log.txt");
        try {
            List<String> read = Files.readAllLines(filePath);
            List<String> IP = new ArrayList();

            for(int i=0; i<=read.size(); i++) {
               IP.add(read.get(4));

                System.out.println(IP);
            }

        }catch (IOException exception){
            System.out.println("");
        }
    }
}
