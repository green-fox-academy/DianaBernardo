import java.util.ArrayList;
import java.util.List;

public class Sum {

  int sumOfNumbers;

  public int sum(List<Integer> numbers) {

    for (int i = 0; i < numbers.size(); i++) {
      sumOfNumbers += numbers.get(i);
    }
    return sumOfNumbers;
  }
}
