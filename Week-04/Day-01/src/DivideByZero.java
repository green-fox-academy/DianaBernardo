// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0



public class DivideByZero {
    public static void main(String[] args) {
        divider(0);
    }

    public static void divider(int x) {

        try {
            int result = 10 / x;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
