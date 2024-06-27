package com.leetcode.easy;

public class ValidPerfectSquare {

  boolean isPerfectSquare(int num) {
    int min = 1;
    int max = num;
    while (min <= max) {
      int middle = min + (max - min) / 2;
      if (num / middle < middle) {
        max = middle - 1;
      } else if (num / middle == middle && num % middle == 0) {
        return true;
      } else {
        min = middle + 1;
      }
    }
    return false;
  }
}
