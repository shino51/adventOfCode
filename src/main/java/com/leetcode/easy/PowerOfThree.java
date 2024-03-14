package com.leetcode.easy;

public class PowerOfThree {
  public boolean isPowerOfThree(int n) {
    if (n <= 0) return false;
    double root = n;
    do {
      if (root == 1.0) return true;
      root /= 3;
    } while(root % 1.0 == 0.0);
    return false;
  }
}
