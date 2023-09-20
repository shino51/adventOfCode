package com.leetcode.medium;

public class NextPermutation {

  public void nextPermutation(int[] nums) {
    int lastIndex = nums.length - 1;
    int nextNum = nums[lastIndex];
    boolean foundNextPermutation = false;
    for (int i = lastIndex - 1; i >= 0; i--) {
      if (nextNum > nums[i]) {
        // swapping happening
        swap(nums, i, i+1);
        foundNextPermutation = true;
        break;
      }
    }
    if (!foundNextPermutation) {
      reverse(nums);
    }
  }

  private void swap(int[] nums, int previous, int next) {
    int temp = nums[previous];
    nums[previous] = nums[next];
    nums[next] = temp;
  }

  private void reverse(int[] nums) {
    for (int left = 0, right = nums.length - 1; left < right; left++, right--) {
      // swap the values at the left and right indices
      swap(nums, left, right);
    }
  }
}
