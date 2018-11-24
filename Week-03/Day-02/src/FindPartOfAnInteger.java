import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPartOfAnInteger {
  public static void main(String[] args) {
    //  Create a function that takes a number and a list of numbers as a parameter
    //  Returns the indeces of the numbers in the list where the first number is part of
    //  Returns an empty list if the number is not part any of the numbers in the list


    System.out.println(partInteger(1, new int[]{1, 11, 34, 52, 61}));

    System.out.println(partInteger(9, new int[]{1, 11, 34, 52, 61}));
  }

  public static List partInteger(int a, int[] integerList) {

    ArrayList<String> indeces = new ArrayList<>();

    for (int number : integerList) {
      indeces.add("" + number);
    }
    String digit = Integer.toString(a);

    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < indeces.size(); i++) {
      if (indeces.get(i).contains(digit)) {
        result.add(i);
      }
    }
    return result;
  }
}

