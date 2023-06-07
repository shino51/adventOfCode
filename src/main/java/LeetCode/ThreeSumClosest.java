package LeetCode;

public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {
    int result = 0;
    int minimumDiff = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int calculation = nums[i] + nums[j] + nums[k];
          int diff = Math.abs(calculation - target);
          if (diff < minimumDiff) {
            minimumDiff = diff;
            result = calculation;
            if (diff == 0) return calculation;
          }
        }
      }
    }
    return result;
  }
}
