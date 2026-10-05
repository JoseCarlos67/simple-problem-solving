import problem01.TheLargerOfTwoNumbers;
import problem02.LargestOfThreeNumbers;
import problem03.ArithmeticMean;
import problem04.OddOrEven;
import problem04.UnitConverter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//    TheLargerOfTwoNumbers.compare();
//    LargestOfThreeNumbers.compare();
//    ArithmeticMean.arithmeticMean();
//    OddOrEven.verify(scanner);
    UnitConverter.convert(scanner);

    scanner.close();
  }
}