package com.leetcode.easy;

public class ReverseBits {
  private static final int MASK = 0xffff_ffff;

  public long reverseBits(int n) {
    String binary = Integer.toBinaryString(n);
    String reversed = new StringBuilder(binary).reverse().toString();
    if (n >= 0) {
      // add 0's until 32 bits
      while(reversed.length() < 32) {
        reversed += "0";
      }
    }
    return Long.parseLong(reversed, 2);
  }
}
