package leetcode.easy.sum.of.two.nums;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    if (nums != null) {
      int len = nums.length;
      if (len >= 2) {
        int[] targetIndices = new int[2];

        for (int i = 0; i < len; i++) {
          for (int j = i + 1; j < len; j++) {
            if (nums[i] + nums[j] == target) {
              targetIndices[0] = i;
              targetIndices[1] = j;
              return targetIndices;
            }
          }
        }
      }
    }
    return null;
  }
}
