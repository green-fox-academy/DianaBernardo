import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  Sum sum1;
  List<Integer> numbersTest;
  List<Integer> emptyList;
  List<Integer> oneElement;


  @BeforeEach
  void setUp() {
    sum1 = new Sum();
    numbersTest = new ArrayList<>();
    numbersTest.add(1);
    numbersTest.add(2);

    emptyList = new ArrayList<>();

    oneElement = new ArrayList<>();
    oneElement.add(4);
  }

  @Test
  void sum() {
    assertEquals(3, sum1.sum(numbersTest));
  }

  @Test
  void sumWithEmptyList() {
    assertEquals(0, sum1.sum(emptyList));
  }

  @Test
  void sumWithOneElement() {
    assertEquals(4, sum1.sum(oneElement));
  }

  @Test
  void sumWithNull() {
    assertThrows(NullPointerException.class, () -> {
      sum1.sum(null);
    });
  }
}