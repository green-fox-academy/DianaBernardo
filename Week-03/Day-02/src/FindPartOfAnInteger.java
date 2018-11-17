import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.List;

public class FindPartOfAnInteger {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        // System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        // System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'

        int number = 1;
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(11);
        integerList.add(34);
        integerList.add(52);
        integerList.add(61);


        partInteger(number, integerList);
    }

    public static List partInteger(int number, List<Integer> integerList) {

        ArrayList<Integer> indeces = new ArrayList<Integer>();

        for (int i = 0; i < integerList.size(); i++) {
            int a = integerList.get(i)%10;
            int b = integerList.get(i)/10;

            if (a == number || b == number) {
                indeces.add(integerList.indexOf(i));}
                }


        return
    }
}