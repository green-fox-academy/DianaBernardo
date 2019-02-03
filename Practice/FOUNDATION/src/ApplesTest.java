import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
    System.out.println("This is the before test");
  }

  @org.junit.jupiter.api.Test
  void apple() {
    Apples apple = new Apples();
    assertEquals("apple", apple.apple());
  }
}