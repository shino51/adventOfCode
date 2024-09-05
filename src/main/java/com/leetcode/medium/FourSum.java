package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    int lastIndex = nums.length - 1;
    for (int firstIndex = lastIndex; firstIndex >= 3; firstIndex--) {
      for (int secondIndex = firstIndex - 1; secondIndex >= 2; secondIndex--) {
        long sum = (long) nums[firstIndex] + nums[secondIndex];
        int thirdIndex = secondIndex - 1;
        findFourthIndex(nums, target, result, sum, firstIndex, secondIndex, thirdIndex);
      }
    }
    return result;
  }

  private void findFourthIndex(int[] nums, int target, List<List<Integer>> result, long sum, int firstIndex, int secondIndex, int thirdIndex) {
    while (thirdIndex > 0) {
      int fourthIndex = thirdIndex - 1;
      long currentSum = sum;
      int currentThirdNum = nums[thirdIndex];
      currentSum += currentThirdNum;
      boolean found = false;
      while (fourthIndex >= 0 && !found) {
        int currentFourthNum = nums[fourthIndex];
        if (currentSum + currentFourthNum == target) {
          found = true;
          addNumsIntoList(nums, result, firstIndex, secondIndex, thirdIndex, fourthIndex);
        }
        fourthIndex--;
      }
      thirdIndex--;
    }
  }

  private void addNumsIntoList(int[] nums, List<List<Integer>> result, int i, int j, int thirdIndex, int fourthIndex) {
    // combination found
    List<Integer> combination = new ArrayList<>();
    combination.add(nums[i]);
    combination.add(nums[j]);
    combination.add(nums[thirdIndex]);
    combination.add(nums[fourthIndex]);
    if (!result.contains(combination)) {
      result.add(combination);
    }
  }
}
