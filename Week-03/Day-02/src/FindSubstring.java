//  Create a function that takes a string and a list of string as a parameter
//  Returns the index of the string in the list where the first string is part of
//  Only need to find the first occurence and return the index of that
//  Returns `-1` if the string is not part any of the strings in the list

// Example
// String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
// System.out.println(subStrList("ching", searchArr));
//  should print: `4`
// System.out.println(subStrList("not", searchArr));
//  should print: `-1`


import java.util.List;

public class FindSubstring {
  public static void main(String[] args) {

    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
    System.out.println(findSubstring("ching", searchArr));
    System.out.println(findSubstring("not", searchArr));

  }

  public static Integer findSubstring (String input, String[] inputList) {
    int index = 0;
    for (int i = 0; i < inputList.length; i++) {
      if (inputList[i].contains(input)) {
        index = i;
        return index;
      }
      else {
        index = -1;
      }
    }
    return index;
  }
}
