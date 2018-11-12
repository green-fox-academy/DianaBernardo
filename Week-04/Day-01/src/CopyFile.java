// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        copy("./my-file.txt", "./function");

    }

    public static boolean copy(String file1, String file2) {

        Path filePath = Paths.get(file1);
        try {
            List<String> file1content = Files.readAllLines(filePath);

            Path filePath2 = Paths.get(file2);
            Files.write(filePath2, file1content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
}