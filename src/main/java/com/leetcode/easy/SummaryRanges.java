package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

  public List<String> summaryRanges(int[] nums) {
    if (nums.length == 0) {
      return Collections.emptyList();
    }
    List<String> result = new ArrayList<>();
    int startingPoint = nums[0];
    int previousInt = startingPoint;
    for (int i = 1; i < nums.length; i++) {
      int currentInt = nums[i];
      if ((previousInt + 1) != currentInt) {
        result.add(buildRangeString(startingPoint, previousInt));
        startingPoint = currentInt;
      }
      // the number is incremented before the next iteration
      previousInt = currentInt;
    }
    result.add(buildRangeString(startingPoint, previousInt));
    return result;
  }

  private String buildRangeString(int startingPoint, int endingInt) {
    StringBuilder range = new StringBuilder().append(startingPoint);
    if (startingPoint != endingInt) {
      range.append("->").append(endingInt);
    }
    return range.toString();
  }
}
