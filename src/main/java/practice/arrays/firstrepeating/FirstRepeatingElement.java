package practice.arrays.firstrepeating;

/*
How find the first repeating element in an array of integers? (solution)
Given an array of integers, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first
occurrence is smallest.

Examples:

Input:  input [] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 [5 is the first element that repeats]
 */

import java.util.Arrays;

public class FirstRepeatingElement {
  public static void main(String args[]) {
    int a[] = {10, 5, 3, 4, 3, 5, 6};

    Arrays.sort(a);
    System.out.println(Arrays.toString(a));

    System.out.println(getFirstRepeatingElement(a));
    System.out.println(getFirstRepeatingElement1(a));

    int b[] = {10, 5, 3, 4, 9, 10, 6};

    Arrays.sort(b);
    System.out.println(Arrays.toString(b));

    System.out.println(getFirstRepeatingElement(b));
    System.out.println(getFirstRepeatingElement1(b));
  }

  static int getFirstRepeatingElement(int a[]) {
    int al = a.length;
    for (int i = 0; i < al; i++) {
      for (int j = i + 1; j < al; j++) {
          if(a[i] == a[j])
              return a[i];
      }
    }
    return -1;
  }

  static int getFirstRepeatingElement1(int a[]) {

    for(int i = 0; i < a.length - 1; i++) {
      if(a[i] == a[i+1])
        return a[i];
    }

    return -1;
  }
}
