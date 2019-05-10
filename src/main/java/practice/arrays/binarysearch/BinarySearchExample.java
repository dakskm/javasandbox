package practice.arrays.binarysearch;

import java.util.Arrays;

public class BinarySearchExample {
  public static void main(String args[]) {
    int a[] = {2, 3, 4, 10, 40};
//    bs(a, 1);
//    bs(a, 2);
//    bs(a, 3);
//    bs(a, 4);
//    bs(a, 10);
//    bs(a, 40);
    bs(a, 50);
  }

  static void bs(int a[], int x) {
    Arrays.sort(a);
    int result = binarySearch(a, 0, a.length - 1, x);

    if (result == -1) System.out.println(x + " not found in array");
    else System.out.println(x + " found in array");
  }

  static int binarySearch(int a[], int l, int r, int x) {
    if (r >= l) {
      int mid = l + ((r - l) / 2);

      if (a[mid] == x)
          return mid;

      if (a[mid] > x)
          return binarySearch(a, l, mid - 1, x);

      return binarySearch(a, mid + 1, r, x);
    }

    return -1;
  }
}
