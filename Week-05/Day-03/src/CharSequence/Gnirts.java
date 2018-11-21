package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence{

    String string;

    public Gnirts(String string) {
        this.string = string;

    }

    @Override
    public int length() {
        return string.length() * 10;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder(this.string);
        sb.reverse();
        return sb;
    }

}
