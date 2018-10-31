// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end


import java.lang.reflect.Array;
import java.util.Arrays;

public class AppendA2 {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};

        String x = Arrays.toString(animals);
        for(int i=0; i<animals.length; i++){
            System.out.println(appendAFunc(animals[i]));
        }
    }


    public static String appendAFunc(String args) {
        StringBuilder sb = new StringBuilder("a");
        return args + sb;
    }
}
