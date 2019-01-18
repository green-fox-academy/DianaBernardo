import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  Sum sum1;
  List<Integer> test;

  @BeforeEach
  void setUp() {
    System.out.println("before bla bla");
    sum1 = new Sum();
    test = new ArrayList<>();
    test.add(50);
    test.add(40);
  }

  @Test
  void sum() {

    assertEquals(90, sum1.sum(test));
  }
}