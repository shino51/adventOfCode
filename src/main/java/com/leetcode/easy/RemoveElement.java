package com.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/remove-element/">remove element</a>
 */
public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int index = 0;
    for(int i = 0; i < nums.length; i++) {
      if (index+1 <= nums.length && nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}
