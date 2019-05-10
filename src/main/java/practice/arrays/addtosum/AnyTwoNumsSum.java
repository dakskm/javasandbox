package practice.arrays.addtosum;

/*
How to find all pairs on integer array whose sum is equal to given number? (solution)
This is an intermediate level of array coding question, it's neither too easy nor too difficult. You have given an
integer array and a number, you need to write a program to find all elements in the array whose sum is equal to the
given number. Remember, the array may contain both positive and negative numbers, so your solution should consider
that. Don't forget to write unit test though, even if the interviewer is not asked for it, that would separate you
from a lot of developers. Unit testing is always expected from a professional developer.

 */

import java.util.Arrays;

public class AnyTwoNumsSum {
  public static void main(String args[]) {
    int[] a = {1, 2, 5, 6, 8, -8, -7, 3};
    int sum = -15;

    subArraySum(a, sum);
  }

  static void subArraySum(int[] a, int x) {
    int len = a.length;

    Arrays.sort(a);
    System.out.println(Arrays.toString(a));

    int l = 0;
    int r = len - 1;
    int sum = 0;
    while (l < r) {
        sum = a[l] + a[r];
        if(sum == x) {
            System.out.printf("index [%d %d] ->  [%d %d]", l, r, a[l], a[r]);
            l++;
            r--;
        } else if(sum < x) {
            l++;
        } else {
            r--;
        }
    }
  }
}
