package practice.arrays.alternative;

import java.util.Arrays;

public class  AlternativeNumbers {
  public static void main(String args[]) {
    int a[] = {-1, -2, 1, 2, -3, 4, 5, 6, 7};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    arrangeAlternative(a);

    int a1[] = {-1, -2, 1, -8, -3, -4, -5, 6, 7};
    Arrays.sort(a1);
    System.out.println(Arrays.toString(a1));
    arrangeAlternative(a1);

    int a2[] = {1, 2, 3, 4, 5};
    Arrays.sort(a2);
    System.out.println(Arrays.toString(a2));
    arrangeAlternative(a2);

    int a3[] = {-1, -2, -3, -4, -5};
    Arrays.sort(a3);
    System.out.println(Arrays.toString(a3));
    arrangeAlternative(a3);
  }

  static void arrangeAlternative(int a[]) {
    int l = 0, r = a.length - 1, k = 0;
    int result[] = new int[a.length];

    while (l < r && a[l] < 0 && a[r] > 0) {
      result[k++] = a[l++];
      result[k++] = a[r--];
    }

    while (l <= r) result[k++] = a[l++];

//    if (a[r] <= 0) while (l < r) result[k++] = a[l++];

    System.out.println(Arrays.toString(result));
  }
}
