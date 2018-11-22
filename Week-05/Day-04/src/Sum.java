import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

  public int sum(List<Integer> numbers){
    int result = 0;
    for (int i = 0; i < numbers.size() ; i++) {
      result += numbers.get(i);
    }
    return result;
  }
}
