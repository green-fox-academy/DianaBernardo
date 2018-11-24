import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
  public static void main(String[] args) {
    HashMap<String, Integer> map = lottery("./assets/lottery.txt");
    System.out.println(frequent(map));
  }

  public static HashMap<String, Integer> lottery(String filename) {
    List<String> lines = new ArrayList<>();
    try {
      Path filepath = Paths.get(filename);
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error: cannot read file.");
    }
    List<String> lotteryNumbers  = new ArrayList<>();
    for (String line: lines) {
      for (int i = 11; i < 16; i++) {
        lotteryNumbers.add(line.split(";")[i]);
      }
    }
    HashMap<String, Integer> lotteryMap = new HashMap<>();
    for (int i = 0; i < lotteryNumbers.size() ; i++) {
      String key = lotteryNumbers.get(i);
      if(!lotteryMap.containsKey(key)) {
        lotteryMap.put(key, 1);
      }
      else {
        lotteryMap.put(key, lotteryMap.get(key) + 1);
      }
    }
    return lotteryMap;
  }
  public static List<String> frequent(Map<String, Integer> map) {
    List<Integer> occurence = new ArrayList<>(map.values());
    occurence.sort(Comparator.reverseOrder());
    List<String> mostFrequent = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue().equals(occurence.get(i)) && !mostFrequent.contains(entry.getKey())){
          mostFrequent.add(entry.getKey());
        }
      }
    }
    return mostFrequent;
  }
}
