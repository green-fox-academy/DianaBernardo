
//  Create the usual clas wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer


public class Summing {
    public static void main(String[] args) {

        System.out.println(sum(6));

    }

        public static int sum(int x){
        int temp = 0;
        for(int i = 0; i <= x; i++){
          temp += i;
        }
        return temp;
    }
}
