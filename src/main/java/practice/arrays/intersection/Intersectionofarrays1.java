package practice.arrays.intersection;

import java.util.Arrays;

public class Intersectionofarrays1 {
  public static void main(String args[]) {
    int a[] = {66, 22, 34, 21, 34, 41, 22, 35};
    int b[] = {76, 75, 76, 76, 61, 34, 45, 11, 21};

    int result[] = intersectedNums(a, b);

    System.out.println(Arrays.toString(result));
  }

  static int[] intersectedNums(int a[], int b[]) {
    Arrays.sort(a);
    Arrays.sort(b);

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));

    int i = 0, j = 0, k = 0;
    int al = a.length;
    int bl = b.length;
    int minl = al > bl ? bl : al;
    int result[] = new int[minl];

    while (i < al && j < bl) {
      if (a[i] == b[j]) {
        result[k++] = a[i];
        i++;
        j++;
      } else if (a[i] > b[j]) {
        j++;
      } else {
        i++;
      }
    }
    return result;
  }
}
