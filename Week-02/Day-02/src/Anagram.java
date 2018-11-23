//Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.


import com.sun.tools.hat.internal.util.ArraySorter;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
      isAnagram("anagram", "margana");

    }

        public static boolean isAnagram (String input1, String input2) {

          boolean status = true;

          Scanner scanner = new Scanner(System.in);
          input1 = scanner.next();

          Scanner scanner2 = new Scanner(System.in);
          input2 = scanner2.next();

          String s1 = input1.replaceAll("\\s", "");
          String s2 = input2.replaceAll("\\s", "");


          if (s1.length() != s2.length()) {
            status = false;
          } else {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

                if (s1Array == s2Array) {
                  status = true;
                }
                  else {
                  status = false;
                }
            }
            return status;
        }
    }
