package com.leetcode.medium;

public class ReverseInteger {
  public int reverse(int x) {
    boolean isMinusValue = x < 0;
    StringBuilder stringVal = new StringBuilder().append(x);
    String reversed = stringVal.reverse().toString().replace("-", "");
    long resultNumber = Long.parseLong(reversed);
    if (resultNumber >= Math.pow(2, 31)) {
      return 0;
    }
    return isMinusValue ? (int) (-1 * Long.parseLong(reversed)) : (int) Long.parseLong(reversed);
  }
}
