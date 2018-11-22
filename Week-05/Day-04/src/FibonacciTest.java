import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  Fibonacci fibo;

  @BeforeEach
  void setUp() {
    fibo = new Fibonacci();
  }

  @Test
  void fibonacciTester() {
    assertEquals(1, Fibonacci.fibonacci(2) );
  }

  @Test
  void fibonacciTesterforIndexSix() {
    assertEquals(8, Fibonacci.fibonacci(6) );
  }
}