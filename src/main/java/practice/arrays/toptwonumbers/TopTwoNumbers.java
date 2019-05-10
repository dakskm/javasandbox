package practice.arrays.toptwonumbers;

public class TopTwoNumbers {
  public static void main(String args[]) {
    int a[] = {95, 62, 9999, 1, 32, 54, Integer.MAX_VALUE};

    findTopTwoMaxNums(a);
  }

  static void findTopTwoMaxNums(int a[]) {
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
        if(a[i] > max1) {
            max2 = max1;
            max1 = a[i];
        } else if(a[i] > max2) {
            max2 = a[i];
        }
    }

    System.out.printf("max1 is %d and max2 is %d", max1, max2);
  }
}
