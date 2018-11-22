import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

  Sharpie sharpie1;

  @BeforeEach
  void setUp() {
    sharpie1 = new Sharpie("blue", 50);
  }

  @Test
  void testUse() {
    assertEquals(99.0, sharpie1.use());
  }
}