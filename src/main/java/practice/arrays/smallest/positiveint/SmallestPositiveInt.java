package practice.arrays.smallest.positiveint;

/*
How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array?
(solution)This is another tough array question you will see on Amazon, Microsoft or Google. You have given a sorted
array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be
represented as sum of elements of any subset of given set. What makes it more challenging is expected time
complexity of O(n).
 */

public class SmallestPositiveInt {
  public static void main(String args[]) {
    int a[] = {1, 3, 5, 6, 8, 13};
    int b[] = {1, 1, 1, 1};

    printSmallestPositiveInt(a);
    printSmallestPositiveInt(b);
  }

  static void printSmallestPositiveInt(int a[]) {
    int result = 1;

    for (int i = 0; i < a.length; i++) {
        if(result >= a[i])
            result = result + a[i];
    }

    System.out.printf("smallest value is " + result);
  }
}
