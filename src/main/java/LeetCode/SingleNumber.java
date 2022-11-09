package LeetCode;

import java.util.Arrays;

public class SingleNumber {

  public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    int lastIndex = nums.length - 1;
    for (int i = 0; i < lastIndex; i += 2) {
      if (nums[i] != nums[i + 1]) {
        return nums[i];
      }
    }
    return nums[lastIndex];
  }
}
