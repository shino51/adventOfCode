package com.leetcode.medium;

public class FindFirstAndLastPositionOfElementInSortedArray {

  public int[] searchRange(int[] nums, int target) {
    final int[] result = new int[]{-1, -1};
    result[0] = binarySearch(nums, target, true);
    result[1] = binarySearch(nums, target, false);

    return result;
  }

  private int binarySearch(int[] nums, int target, boolean isSearchOnLeft) {
    int left = 0;
    int right = nums.length - 1;
    int index = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] > target) {
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        index = mid;
        if (isSearchOnLeft) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
    }
    return index;
  }
}
