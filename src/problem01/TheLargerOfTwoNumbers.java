package problem01;

import java.util.Scanner;

public class TheLargerOfTwoNumbers {

  public static void compare() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the value of A:");
    Integer a = scanner.nextInt();

    System.out.println("Enter the value of B:");
    Integer b = scanner.nextInt();

    Integer difference = a - b;

    if (difference > 0)
      System.out.println("The value in A is greater than the value in B!\n"
        + "Difference = " + difference
      );
    if (difference < 0)
      System.out.println("The value in B is greater than the value in A!\n"
        + "Difference = " + difference
      );
    else
      System.out.println("The value of A is equal to the value of B");

    scanner.close();
  }

}
