package problem06.problem06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class WordCounter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a sentence here: ");
    String sentence = scanner.nextLine();

    System.out.println(sentence);

    ArrayList<String> worlds = new ArrayList<>(
            Arrays.asList(sentence.split(" "))
    );

    HashMap<String, Integer> worldOccurrence = new HashMap<>();

    for (String world : worlds) {
      worldOccurrence.put(world, worldOccurrence.getOrDefault(world, 0) + 1);
    }

    worldOccurrence.forEach((word, count) -> {
      System.out.println(word + "->" + count);
    });

    scanner.close();
  }
}
