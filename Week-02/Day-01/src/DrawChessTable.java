public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i % 2 == 0) {
                    System.out.print(" %");
                } else {
                    System.out.print("% ");
                }
            }
            System.out.println(" ");
        }
    }
}
