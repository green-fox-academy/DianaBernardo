import java.util.*;

public class Quoteswap {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

        }
         public static String quoteSwap (ArrayList <String> inputList){
            String sentence = "";
             String temp = inputList.get(2);
             inputList.set(2, inputList.get(5));
             inputList.set(5, temp);
             for (int i = 0; i < inputList.size(); i++) {
                 sentence += inputList.get(i) + " ";

             }
             return sentence;

    }
}
