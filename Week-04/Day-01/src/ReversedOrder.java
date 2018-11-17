import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args){

        try{
            Path filepath = Paths.get("./assets/reversedOrder.txt");
            List<String> lines = Files.readAllLines(filepath);

            List <String> ordered = new ArrayList<>();

                for (int i = 0; i < lines.size(); i++) {
                    ordered.add(lines.get(lines.size() - 1 - i));
                    ordered.add("\n");
                }
                System.out.println(ordered);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}
