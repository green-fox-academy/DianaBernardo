import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  Anagram anagram1;

  String wordA = "banana";
  String wordB = "nanaba";

  @BeforeEach
  void setUp() {
    anagram1 = new Anagram();
  }

  @Test
  void isAnagram() {
    assertTrue(anagram1.isAnagram(wordA, wordB));
  }
}