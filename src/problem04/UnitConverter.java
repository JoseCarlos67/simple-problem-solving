package problem04;

import java.util.Scanner;

public class UnitConverter {

  public static void convert(Scanner scanner) {

    System.out.println("1. Millimeters to Centimeters");
    System.out.println("2. Centimeters to Meters");
    System.out.println("3. Meters to Kilometers");
    System.out.print("Choose an option (1-3): ");
    int option = scanner.nextInt();

    System.out.println("Enter de value to be converted: ");
    double value = scanner.nextDouble();

    double result = 0.0;

    switch (option){
      case 1:
        result = value / 10;
        System.out.printf("%.2f mm is equivalent to %.2f cm.", value, result);
        break;
      case 2:
        result = value / 100;
        System.out.printf("%.3f cm is equivalent to %.3f m.", value, result);
        break;
      case 3:
        result = value / 1000;
        System.out.printf("%.3f mm is equivalent to %.3f km.", value, result);
        break;
      default:
        System.out.println("Invalid option!");
    }
  }

}
