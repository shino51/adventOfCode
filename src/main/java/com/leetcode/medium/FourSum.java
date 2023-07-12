package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FourSum {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    int numsLength = nums.length;
    for (int i = 0; i < numsLength - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < numsLength - 2; j++) {
        int sumOfTwo = nums[i] + nums[j];
        if (sumOfTwo >= target) {
          return result;
        }
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        for (int k = j + 1; k < numsLength - 1; k++) {
          int sumOfThree = nums[k] + sumOfTwo;
          if (sumOfThree >= target || (k > j + 1 && nums[k] == nums[k - 1])) {
            continue;
          }
          for (int l = k + 1; l < numsLength; l++) {
            if (l > k + 1 && nums[l] == nums[l - 1]) {
              continue;
            }
            int sum = sumOfThree + nums[l];
            if (sum == target) {
              List<Integer> combination = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
              combination.sort(Comparator.naturalOrder());
              validateAndAddList(result, combination);
            }
          }
        }
      }
    }
    return result;
  }

  private void validateAndAddList(List<List<Integer>> result, List<Integer> combination) {
    for (List<Integer> listOne : result) {
      if (listOne.equals(combination)) {
        return;
      }
    }
    result.add(combination);
  }
}
