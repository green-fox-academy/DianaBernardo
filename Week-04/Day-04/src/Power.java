// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        System.out.println(power(8, 4));
    }

    public static int power(int base, int n) {
        if (n != 0) {
            return (base * power(base, n-1));
        } else {
            return 1;
        }
    }
}
