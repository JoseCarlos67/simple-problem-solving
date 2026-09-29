package problem02;

import java.util.Scanner;

public class LargestOfThreeNumbers {

  public static void compare() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the value of A:");
    Integer a = scanner.nextInt();

    System.out.println("Enter the value of B:");
    Integer b = scanner.nextInt();

    System.out.println("Enter the value of C:");
    Integer c = scanner.nextInt();

    Integer greater = a;

    if (b > greater)
      greater = b;
    if (c > greater)
      greater = c;

    System.out.println("The largest number is: " + greater);

    scanner.close();
  }

}
