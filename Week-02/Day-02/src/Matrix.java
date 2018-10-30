// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output


import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        String[][] multiArray = new String[4][4];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {

                if (i == j) {
                    System.out.println("1");

                } else {
                    System.out.println("0");

                    }
                }
            }
        }
    }

