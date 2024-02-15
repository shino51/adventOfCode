package com.leetcode.easy;

public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 0) {
        int offset = 1;
        while (nums[i + offset] == 0) {
          offset++;
          if (i + offset >= nums.length) {
            // there are only zeros at the end
            return;
          }
        }
        // swap value
        int tmp = nums[i];
        nums[i] = nums[i + offset];
        nums[i + offset] = tmp;
      }
    }
  }
}
