package com.leetcode.easy;

public class CountingBits {
  public int[] countBits(int num) {
    int[] output = new int[num + 1];
    for (int i = 1; i <= num; i++) output[i] = output[i >> 1] + (i & 1);
    return output;
  }
}
