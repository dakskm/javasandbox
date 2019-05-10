package practice.search.binary;

/*
ow to check if array contains a number in Java? (solution)
Another interesting array problem, because array doesn't provide any built-in method to check if any number exists or
not. This problem is essentially how to search an element in the array. There are two options sequential search or
binary search. You should ask the interviewer about whether an array is sorted or not, if the array is sorted then
you can use binary search to check if given number is present in an array or not. The complexity of binary search is
O(logN). BTW, if interviewer says that array is not sorted then you can still sort and perform binary search otherwise
you can use sequential search. Time complexity of sequential search in array is O(n)
 */

import java.util.Arrays;

public class BinarySearch {
  public static void main(String args[]) {
    int a[] = {10, 80, 30, 90, 50, 70};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    System.out.println(binarySearch(a, 0, a.length - 1, 70));
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
