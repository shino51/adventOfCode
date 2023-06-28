package com.leetcode.easy;

public class NumberOf1Bits {

  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    String binary = Integer.toBinaryString(n);
    return (int) binary.chars().filter(ch -> ch == '1').count();
  }
}
