package practice.arrays.everyelementrepeated;

import java.util.Arrays;

public class FindUnique1 {
  static final int NUMBERS = 10;

  public static void main(String args[]) {


//    xxxxxxxxxxxxxxx


//    int a[] = {5, 5, 2, 2, 0, 4, 4, 1, 1, 6, 7, 7, 6};
//
//    int result = getUniqueElement(a);
//
//    if (result == -1) {
//      System.out.println("all elements are repeated");
//    } else {
//      System.out.printf("element %d isn't repreated", result);
//    }
  }

  static int getUniqueElement(int[] a) {
    int[] count = new int[NUMBERS];

    for (int i = 0; i < a.length; i++) {
        count[a[i]]++;
    }

    System.out.println(Arrays.toString(count));

    for (int i = 0; i < NUMBERS; i++)
      if (count[i] == 1) {
        return i;
      }

    return -1;
  }
}
