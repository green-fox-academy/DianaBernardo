import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

  CountLetters countLetters;

  String word = "sentence";

  HashMap<Character, Integer> dictionaryTest = new HashMap<>();


  @BeforeEach
  void setUp() {
    countLetters = new CountLetters();
    dictionaryTest.put('s', 1);
    dictionaryTest.put('c', 1);
    dictionaryTest.put('t', 1);
    dictionaryTest.put('e', 3);
    dictionaryTest.put('n', 2);
  }

  @Test
  void count() {
    assertEquals(dictionaryTest, CountLetters.count(word));
  }
}