package LeetCode;

import java.util.Arrays;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    return nums[(length - 1) / 2];
  }
}
