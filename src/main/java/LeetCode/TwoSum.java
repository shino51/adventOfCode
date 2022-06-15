package LeetCode;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
      for (int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
        if (nums[firstIndex] + nums[secondIndex] == target) {
          return new int[] {firstIndex, secondIndex};
        }
      }
    }
    return null;
  }
}
