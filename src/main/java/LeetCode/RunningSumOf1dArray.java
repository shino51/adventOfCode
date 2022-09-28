package LeetCode;

public class RunningSumOf1dArray {
  public int[] runningSum(int[] nums) {
    int previous = 0;
    for(int i = 0; i < nums.length; i++) {
      nums[i] += previous;
      previous = nums[i];
    }
    return nums;
  }
}
