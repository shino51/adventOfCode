package com.leetcode.medium;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
      return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int firstIndex, int lastIndex, int target) {
      if (firstIndex >= lastIndex) {
        return nums[firstIndex] == target? firstIndex : -1;
      }
      int firstValue = nums[firstIndex];
      int lastValue = nums[lastIndex];
      if (firstValue == target) {
        return firstIndex;
      } else if (lastValue == target) {
        return lastIndex;
      }

      int middleIndex = firstIndex + (lastIndex - firstIndex/2);
      if (middleIndex == lastIndex) {
        return -1;
      }

      if (middleIndex <= lastIndex && isPossiblyBetweenRange(firstValue, nums[middleIndex], target)) {
        return search(nums, firstIndex, middleIndex, target);
      } else if (middleIndex + 1 <= lastIndex && isPossiblyBetweenRange(nums[middleIndex + 1], lastValue, target)) {
        return search(nums, middleIndex + 1, lastIndex, target);
      }
      return -1;
    }

    private boolean isPossiblyBetweenRange(int firstValue, int lastValue, int target) {
      if (firstValue > lastValue) {
        return firstValue <= target || target <= lastValue;
      } else {
        return firstValue <= target && target <= lastValue;
      }

    }
}
