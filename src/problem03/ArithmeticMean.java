package problem03;

import java.util.Scanner;

public class ArithmeticMean {

  public static void arithmeticMean() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many numbers do you wish to provide?");
    int quantity = scanner.nextInt();

    int[] numbers = new int[quantity];

    int som = 0;

    for (int i = 0; i < quantity; i++) {
      System.out.println("Enter the value that will be in position " + i + ":");
      numbers[i] = scanner.nextInt();

      som += numbers[i];
    }

    int result = som / quantity;

    System.out.println("The result of the arithmetic mean is: " + result);

    scanner.close();
  }

}
