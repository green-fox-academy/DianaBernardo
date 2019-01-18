import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  Anagram anagram;
  String word1 = "sdjfksdj";
  String word2 = "ndfjk";

  @BeforeEach
  void setUp() {
    anagram = new Anagram();
  }

  @Test
  void isAnagram() {
    assertFalse(anagram.isAnagram(word1, word2));
  }
}