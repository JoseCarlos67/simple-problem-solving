package problem10.problem11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberFrequency {

  public static void main(String[] args) {
    count();
  }

  private static void count() {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 4, 2, 6, 1, 5, 4, 4, 3 , 1, 2, 2, 22};

    Map<Integer, Integer> frequency = new HashMap<>();

    for(int number : numbers) {
      frequency.merge(number, 1, Integer::sum);
    }

    frequency.forEach((k, v) ->
                    System.out.println(k + " -> "+ v + " vezes")
            ); {}

    scanner.close();
  }

}
