package com.leetcode.easy;

public class PowerOfTwo {
  public boolean isPowerOfTwo(int n) {
    if (n == 0) {
      return false;
    }
    return validate(n);
  }

  boolean validate(int n) {
    if (n % 2 == 0) {
      return validate(n / 2);
    }
    return n == 1;
  }
}
