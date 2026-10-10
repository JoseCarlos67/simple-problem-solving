package problem09;

public class SmallestAndLargest {

  public static void main(String[] args) {
    int[] numbers = {8, 3, 15, -2, 7, 10};
    if(numbers.length == 0 || numbers == null ){
      System.out.println("Array is empty");
    } else {
      int[] result = compare(numbers);
      System.out.println("Smallest = " + result[0]);
      System.out.println("Largest = " + result[1]);
    }
  }

  private static int[] compare(int[] numbers) {
    int smallest = numbers[0];
    int largest = numbers[0];

    for (int number : numbers) {
      if(smallest > number)
        smallest = number;

      if(largest < number)
        largest = number;
    }

    return new int[]{smallest, largest};
  }

}
