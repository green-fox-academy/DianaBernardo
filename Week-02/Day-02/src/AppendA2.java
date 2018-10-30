// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end


public class AppendA2 {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
    }

}

        public static String appendAFunc(String args) {
            StringBuilder sb = new StringBuilder("a");
            return args + sb;
    }
