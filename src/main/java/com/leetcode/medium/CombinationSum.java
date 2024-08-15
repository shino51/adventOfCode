package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    // loop it from the bigger number
    for (int i = candidates.length - 1; i >= 0; i--) {
      collectCombination(0, i, candidates, target, new ArrayList<>(), result);
    }

    return result;
  }

  private void collectCombination(int currentSum, int currentIndex, int[] candidates, int target, List<Integer> combination, List<List<Integer>> result) {

    if (currentIndex < 0) {
      return;
    }
    int candidate = candidates[currentIndex];
    int nextSum = currentSum + candidate;

    int remaining = target - nextSum;
    combination.add(candidate);

    if (remaining == 0) {
      result.add(combination);
      return;
    } else if (remaining < 0) {
      return;
    }

    int nextIndex = currentIndex;
    while (nextIndex >= 0) {
      collectCombination(nextSum, nextIndex, candidates, target, new ArrayList<>(combination), result);
      nextIndex--;
    }
  }
}
