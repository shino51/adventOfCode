package com.leetcode.easy;

import java.util.*;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    int[] distinctArray = Arrays.stream(nums).distinct().toArray();
    return distinctArray.length != nums.length;
  }
}
