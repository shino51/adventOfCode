package com.leetcode.easy;

import java.util.Arrays;

public class MissingNumber {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int previous = -1;
    for (int currentNum : nums) {
      if (++previous != currentNum) return previous;
    }
    return nums.length;
  }
}
