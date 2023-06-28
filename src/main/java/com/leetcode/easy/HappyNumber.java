package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

  public boolean isHappy(int n) {
    int result = n;
    List<Integer> process = new ArrayList<>();
    process.add(n);
    while (result != 1) {
      result = calculate(result, 0);
      if (process.contains(result)) {
        return false;
      }
      // check to avoid endless loop
      process.add(result);
    }
    return true;
  }

  private int calculate(int n, int sum) {
    int processingNum = n % 10;
    sum += Math.pow(processingNum, 2);
    if (processingNum == n) {
      return sum;
    } else {
      int nextNumber = n / 10;
      return calculate(nextNumber, sum);
    }
  }
}
