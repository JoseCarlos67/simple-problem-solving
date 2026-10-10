package problem10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelCounter {

  public static void main(String[] args) {
    count();
  }

  private static void count() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a sentence: ");
    String sentence = scanner.nextLine();

    Map<Character, Integer> result = new HashMap<>(Map.of('a', 0, 'e', 0, 'i', 0, 'o', 0, 'u', 0));

    for (int i = 0; i < sentence.length(); i++) {
      char character = Character.toLowerCase(sentence.charAt(i));

      if (isVogal(character)) {
        result.merge(character, 1, Integer::sum);
      }
    }

    System.out.println("Vowel count: " + result);

    scanner.close();
  }

  private static boolean isVogal(char character) {
    return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
  }
}
