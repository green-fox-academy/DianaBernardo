package CharSequence;

public class Shifter implements CharSequence {

    String text;
    int number;

    public Shifter(String text, int number) {
        this.text = text;
        this.number = number;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index + number);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
