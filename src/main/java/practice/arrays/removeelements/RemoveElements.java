package practice.arrays.removeelements;

import java.util.Arrays;

public class RemoveElements {
  public static void main(String args[]) {
    int a[] = new int[10];
    int b[] = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));

    a = b;

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
}
