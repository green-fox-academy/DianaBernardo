package CharSequence;

public class Main {
    public static void main(String[] args) {

    Gnirts gnirt = new Gnirts("Sentence to try out");
        System.out.println(gnirt.charAt(2));
        System.out.println(gnirt.subSequence(2, 8));
        System.out.println(gnirt.length());

        System.out.println();

        Shifter shifter = new Shifter("Try this sentence now", 2);

        System.out.println(shifter.charAt(5));
    }
}
