package practice.arrays.removedups.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
  public static void main(String args[]) {
    int a[] = {1, 1, 4, 4, 2, 2, 3, 4, 5, 5};
    String b[] = {"Ram", "Rudra", "Dakshin", "Sowju", };

//    Arrays.sort(b);
//
//    System.out.println(Arrays.toString(b));

    Arrays.sort(a);

//    removeDupsType1(a);
//    removeDupsType2(a);
    a = removeDupsType4(a);

    System.out.println(Arrays.toString(a));
  }

  static void removeDupsType1(int a[]) {
    int temp[] = new int[a.length];

    int j = 0;
    for (int i = 0; i < a.length - 1; i++)
        if (a[i] != a[i + 1])
            temp[j++] = a[i];

    temp[j++] = a[a.length - 1];

    for (int i = 0; i < j; i++) a[i] = temp[i];

    System.out.println(Arrays.toString(a));
  }

  static void removeDupsType2(int a[]) {

//    System.out.println("\nAfter removing duplicates:");
    int b = 0;
    a[b] = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[b] != a[i]) {
        b++;
        a[b] = a[i];
      }
    }
    System.out.println(Arrays.toString(a));
  }

  static int[] removeDupsType3(int a[]) {
    int n = a.length;
    int temp[] = new int[n];

    int j = 0;
    for (int i = 0; i < n - 1; i++) {
      if (a[i] != a[i+1]) {
        temp[j++] = a[i];
      }
    }
    temp[j++] = a[n-1];
    a = null;

    return temp;
  }

  static int[] removeDupsType4(int a[]) {
    int n = a.length;
    HashSet<Integer> hs = new HashSet<Integer>();

    for(int i: a)
      hs.add(i);

    int newSize = hs.size();
    int temp[] = new int[newSize];

    int j = 0;
    for (int i = 0; i < n - 1; i++) {
      if (a[i] != a[i+1]) {
        temp[j++] = a[i];
      }
    }
    temp[j++] = a[n-1];

    return temp;
  }

}
