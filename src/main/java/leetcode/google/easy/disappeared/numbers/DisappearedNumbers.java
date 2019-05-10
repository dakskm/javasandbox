package leetcode.google.easy.disappeared.numbers;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
  public static void main(String args[]) {
    findDisappearedNums(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
  }

  public static List<Integer> findDisappearedNums(int nums[]) {
    List<Integer> result = new ArrayList<Integer>();

    for (int no : nums) {
      int index = Math.abs(no) - 1;
      if (nums[index] > 0) {
        nums[index] = -nums[index];
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(i+1);
      }
    }

    System.out.println(result);

    return result;
  }
}
