public class SumDigit {
    public static void main(String[] args) {

        System.out.println(sumDigit(333));

    }

    public static int sumDigit(int n) {
        if (n < 10) {
            return n;
        } else {
            return sumDigit(n/10) + n % 10;
        }
    }
}
