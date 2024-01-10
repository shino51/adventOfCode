package com.leetcode.easy;

public class AddDigits {
  public int addDigits(int num) {
    return calculate(num);
  }

  private int calculate(int num) {
    int result = 0;
    for (char digit : String.valueOf(num).toCharArray()) {
      result += Character.getNumericValue(digit);
    }
    if (result >= 10) {
      return calculate(result);
    }
    return result;
  }
}
