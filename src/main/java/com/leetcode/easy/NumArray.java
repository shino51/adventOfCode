package com.leetcode.easy;

import java.util.stream.IntStream;

/**
 * My NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
public class NumArray {

  private final int[] nums;

  public NumArray(int[] nums) {
    this.nums = nums;
  }

  public int sumRange(int left, int right) {
    return IntStream.rangeClosed(left, right).reduce(0, (a, b) -> a + nums[b]);
  }
}