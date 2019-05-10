package leetcode.google.easy.plusone;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOneArray {
  public static void main(String args[]) {
//    plueOneArray(new int[]{4, 3, 2, 1});
//    plueOneArray(new int[]{1, 0, 1});
    plueOneArray(new int[]{9,8,7,6,5,4,3,2,1,0});
  }

  public static int[] plueOneArray(int[] digits) {
    long sum = 0;
    int len = digits.length;

    for (int i = 0; i < len; i++) {
      sum = (sum * 10) + digits[i];
    }
    sum = sum + 1;

    System.out.println(sum);

    ArrayList<Integer> al = new ArrayList<Integer>();
    while (sum != 0) {
      int r = (int) (sum % 10);
//      System.out.println(r);
      al.add(r);
      sum = sum / 10;
//      System.out.println(sum);
    }

//    System.out.println(al);
    Collections.reverse(al);

    int intArr[] = new int[al.size()];
    System.out.println(al);

    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = al.get(i);
    }
    return intArr;
  }
}
