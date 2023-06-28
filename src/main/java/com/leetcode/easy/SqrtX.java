package com.leetcode.easy;

public class SqrtX {
  public int mySqrt(int x) {
    if (x <= 1) {
      return x;
    }
    for (int i = 1; i <= x / 2; i++) {
      double powerValue = Math.pow(i, 2);
      if (powerValue == x) {
        return i;
      } else if (powerValue > x) {
        return i - 1;
      }
    }
    return x / 2;
  }
}
