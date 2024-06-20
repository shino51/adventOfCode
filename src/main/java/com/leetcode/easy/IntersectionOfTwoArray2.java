package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray2 {

  public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> nums1List = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
    List<Integer> resultList = new ArrayList<>();

    for (int num : nums2) {
      if (nums1List.contains(num)) {
        resultList.add(num);
        nums1List.remove(Integer.valueOf(num));
      }
    }
    return resultList.stream().mapToInt(i -> i).toArray();
  }
}