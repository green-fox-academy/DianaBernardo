// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunnies(50, 2));
    }

    public static int bunnies(int numberBunnies, int ears) {
        ears = 2;
        if (numberBunnies <= 0) {
            return 0;
        } else {
            numberBunnies--;
            return bunnies(numberBunnies, ears) + ears;
        }
    }
}
