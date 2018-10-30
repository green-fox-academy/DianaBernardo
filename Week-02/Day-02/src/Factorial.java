//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


public class Factorial {
    public static void main(String[] args){

        System.out.println(factorio(4));

    }

    public static int factorio(int y){
        int number = 0;
        for(int i=0; i<=y; i++) {
            number += number;
        }
        return number;
        }
    }

