package com.leetcode.medium;

public class NextPermutation {

  public void nextPermutation(int[] nums) {
    int lastIndex = nums.length - 1;
    int index = -1;
    for (int i = lastIndex - 1; i >= 0; i--) {
      if (nums[i + 1] > nums[i]) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      reverse(nums, 0, lastIndex);
      return;
    }
    int breakpoint = nums[index];
    for (int i = lastIndex; i >= index; i--) {
      if (nums[i] > breakpoint) {
        swap(nums, i, index);
        break;
      }
    }

    reverse(nums, index + 1, lastIndex);
  }

  private void swap(int[] nums, int previous, int next) {
    int temp = nums[previous];
    nums[previous] = nums[next];
    nums[next] = temp;
  }

  public void reverse(int[] arr, int l, int r) {
    int start = l;
    int end = r;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
