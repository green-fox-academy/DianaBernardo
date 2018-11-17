import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args){

        Path filepath = Paths.get("./assets/reversedlines.txt");

        try {

            List<String> lines = Files.readAllLines(filepath);

            String reversed = "";

            for (String str: lines) {
                for (int i = 0; i < str.length(); i++) {
                    reversed += str.charAt(str.length()-1 -i);
                }
                reversed+= "\n";
            }
            System.out.println(reversed);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error.");
        }

    }
}
