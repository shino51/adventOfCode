package com.leetcode.easy;

import java.util.Arrays;

public class NumberOfSegmentsInString {
  public int countSegments(String s) {
    long count = Arrays.stream(s.split(" ")).filter(value -> !value.isEmpty()).count();
    return (int) count;
  }
}
