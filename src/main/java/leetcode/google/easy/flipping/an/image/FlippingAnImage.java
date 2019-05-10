package leetcode.google.easy.flipping.an.image;

import java.util.Arrays;

public class FlippingAnImage {
  public static void main(String args[]) {
    int a[][] = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    int[][] result = flipAndInvertImage(a);

    for (int i = 0; i < result.length; i++)
      System.out.print(Arrays.toString(result[i]) + ", ");
  }

  public static int[][] flipAndInvertImage(int[][] A) {
    int arrays = A.length;

    int[][] result = new int[arrays][];
    for (int i = 0; i < arrays; i++) {
      int innnerLen = A[i].length;
      result[i] = new int[innnerLen];
      int k = 0;
      for (int j = innnerLen - 1; j >= 0; j--) {
        if (A[i][j] == 1)
          result[i][k++] = 0;
        else
          result[i][k++] = 1;
      }
    }
    return result;
  }

}
