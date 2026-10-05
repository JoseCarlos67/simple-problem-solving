package problem04;

import java.util.Scanner;

public class OddOrEven {

  public static void verify(Scanner scanner) {
    System.out.println("Enter an integer: ");
    int number = scanner.nextInt();
    int rest = number % 2;

    if (rest == 0)
      System.out.println("The entered number is even!");
    else
      System.out.println("The entered number is odd!");
  }

}
