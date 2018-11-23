//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {
    public static void main(String[] args){

      List<Integer> original = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34 ));
      
      System.out.println(unique(original));

    }

    public static List<Integer> unique (List<Integer> originalList) {
      List<Integer> unique = new ArrayList<>();
      for (int i = 0; i < originalList.size(); i++) {
        if(!unique.contains(originalList.get(i))) {
          unique.add(originalList.get(i));
        }
      }
      return unique;
  }
}
