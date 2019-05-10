package leetcode.easy.sum.of.two.nums;

import java.util.Arrays;

public class MainClass {
  public static void main(String args[]) {
    Solution s1 = new Solution();

    int result[] = s1.twoSum(new int[]{9, 10, 12, 34}, 22);
    System.out.println(Arrays.toString(result));

    int result1[] = s1.twoSum(null, 22);
    System.out.println(Arrays.toString(result1));

    int result3[] = s1.twoSum(new int[]{1}, 22);
    System.out.println(Arrays.toString(result3));
  }
}
