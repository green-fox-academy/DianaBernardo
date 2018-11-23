public class Palindrome {

  public static void main(String[] args) {
    System.out.println(palindrome("greenfox"));
  }

  public static String palindrome(String input) {
    String output = "";
    for (int i = input.length()-1; i >= 0; i--) {
      output += input.charAt(i);
    }
    String output2 = input + output;
    return output2;
  }
}


