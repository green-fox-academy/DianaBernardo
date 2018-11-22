import java.util.HashMap;

public class CountLetters {

  public static HashMap count(String input) {

    input = input.replaceAll("\\s", "").toLowerCase();
    char[] inputArray = input.toCharArray();

    HashMap <Character, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < inputArray.length; i++) {
      if(!dictionary.containsKey(inputArray[i])) {
        dictionary.put(inputArray[i], 1);
      }
      else {
        dictionary.put((inputArray[i]), dictionary.get(inputArray[i]) + 1);
      }
    }
    return dictionary;
  }
}
