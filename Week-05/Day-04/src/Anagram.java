import java.util.Arrays;

public class Anagram {

  public static boolean isAnagram(String word1, String word2) {
    word1 = word1.replaceAll("\\s", "").toLowerCase();
    word2 = word2.replaceAll("\\s", "").toLowerCase();

    char[] wordArray1 = word1.toCharArray();
    char[] wordArray2 = word2.toCharArray();

    Arrays.sort(wordArray1);
    Arrays.sort(wordArray2);

    return (Arrays.equals(wordArray1,wordArray2));
  }
}
