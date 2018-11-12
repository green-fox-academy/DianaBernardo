import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

    public static void main(String [] args){

    }


    public static void linesCounter(String fileName){
        try{
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(fileName);

        } catch (Exception e){
            System.out.println(0);
        }
    }

}
