// Create a method that decrypts the duplicated-chars.txt

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {

        Path filepath = Paths.get("zenOfPython.txt");

        try{

            List<String> lines = Files.readAllLines(filepath);

            String decoded = "";

            for(String str : lines) {
                for (int i = 0; i < str.length(); i+=2) {
                    decoded += (str.substring(i, i+1));
                }
                decoded += "\n";
            }
            System.out.println(decoded);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
