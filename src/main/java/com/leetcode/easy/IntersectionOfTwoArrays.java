package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    HashSet<Integer> resultSet = new HashSet<>();

    for (int num : nums2) {
      if (nums1Set.contains(num)) {
        resultSet.add(num);
      }
    }
    return resultSet.stream().mapToInt(i -> i).toArray();
  }
}
