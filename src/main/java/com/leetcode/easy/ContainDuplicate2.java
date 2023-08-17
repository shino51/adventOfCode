package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate2 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int currentNum = nums[i];
      if (map.containsKey(currentNum)) {
        int previousIndex = map.get(currentNum);
        if ((i - previousIndex) <= k) {
          return true;
        }
      }
      map.put(currentNum, i);
    }
    return false;
  }
}
