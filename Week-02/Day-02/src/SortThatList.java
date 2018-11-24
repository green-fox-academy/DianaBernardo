import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortThatList {
  public static void main(String[] args) {

    List<Integer> sorted = new ArrayList<>();
    sorted.add(34);
    sorted.add(12);
    sorted.add(24);
    sorted.add(9);
    sorted.add(5);

    System.out.println(sorting(sorted));
    System.out.println(sorting(sorted));
  }

  public static List<Integer> sorting(List<Integer> input) {
    boolean order = false;
    if (order) {
      input.sort(Integer::compareTo);
      return input;
    } else {
      Collections.reverse(input);
      return input;
    }
  }
}
