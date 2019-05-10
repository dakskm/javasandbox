package practice.arrays.repeatingnbyktimes;

/*
Given an array of of size n and a number k, find all elements that appear more than n/k times? (solution)
Another tough array based coding questions from Interviews. You are given an array of size n, find all elements in
array that appear more than n/k times. For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4,
then the output should be [2, 3]. Note that size of array is 8 (or n = 8), so we need to find all elements that appear
more than 2 (or 8/4) times. There are two elements that appear more than two times, 2 and 3.
 */

import java.util.HashMap;

public class RepeatingNumbers {

  public static void main(String args[]) {
    int a[] = {3, 1, 2, 2, 1, 2, 3, 3};
    HashMap<Integer, Integer> hmCounts = findRepeatingNumbers(a);
    System.out.println("Array counts " + hmCounts);
  }

  static HashMap<Integer, Integer> findRepeatingNumbers(int a[]) {
    int size = a.length;
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    for (int i = 0; i < size; i++) {
      if (hm.containsKey(a[i])) break;
      for (int j = 0; j < size; j++) {
        if (a[i] == a[j])
          if (!hm.containsKey(a[i])) hm.put(a[i], 1);
          else hm.put(a[i], hm.get(a[i]) + 1);
      }
    }
    return hm;
  }
}
