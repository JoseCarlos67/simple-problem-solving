package problem06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {
  public static void main(String[] args) {
    ArrayList<Integer> firstCollection = new ArrayList<>(Arrays.asList(1, 3, 1, 5, 6, 6, 8, 1, 9, 1, 10));
    System.out.println("List with duplicate values: " + firstCollection);

    TreeSet<Integer> secondCollection = new TreeSet<>(firstCollection);
    System.out.println("List without duplicate values: " + secondCollection);
  }
}
