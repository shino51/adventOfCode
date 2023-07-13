package com.leetcode.easy;

public class ReverseBits {
  public long reverseBits(int n) {
    String binary = Integer.toBinaryString(n);
    StringBuilder reversed = new StringBuilder(binary).reverse();
    if (n >= 0) {
      // add 0's until 32 bits
      while(reversed.length() < 32) {
        reversed.append("0");
      }
    }
    return Long.parseLong(reversed.toString(), 2);
  }
}
