package problem08;

import java.util.*;

public class FirstRepeatedElement {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 2, 9, 7, 5, 2));
    LinkedHashSet<Integer> set = new LinkedHashSet<>();

    Integer result = null;

    for (Integer num : list) {
      if(!set.add(num)) {
        result = num;
        break;
      }
    }

    System.out.println(result);
  }
}
