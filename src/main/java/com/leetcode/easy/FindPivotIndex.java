package com.leetcode.easy;

import java.util.Arrays;

public class FindPivotIndex {
  public int pivotIndex(int[] nums) {
    int index = 0;
    int sum = Arrays.stream(nums).sum();
    int leftSum = 0;
    while(index < nums.length) {
      if(leftSum == (sum - nums[index] - leftSum)) {
        return index;
      }
      leftSum += nums[index];
      index++;
    }
    return -1;
  }
}
