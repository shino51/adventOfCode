package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class UglyNumber {

  public boolean isUgly(int n) {
    if (n == 0) {
      return false;
    }
    List<Integer> uglyPrimeFactors = Arrays.asList(2, 3, 5);
    int remainingNumber = n;
    for (int uglyPrimeFactor : uglyPrimeFactors) {
      if (remainingNumber % uglyPrimeFactor == 0) {
        while (remainingNumber % uglyPrimeFactor == 0) {
          remainingNumber /= uglyPrimeFactor;
        }
      }
    }
    // check if n is consist of only with the ugly numbers
    return remainingNumber == 1;
  }
}
