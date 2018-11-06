import java.util.*;

public class AppendLetter2 {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static List appendA(List<String> animals){
        List<String> animalsA = new ArrayList<>();
        for(int i=0; i<animals.size(); i++){
            animals.set(i, animals.get(i) + "a");
        }
        return animals;
    }
}
