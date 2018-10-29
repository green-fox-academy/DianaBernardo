import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.print("% ");
            System.out.println("");
        }
        }
    }
