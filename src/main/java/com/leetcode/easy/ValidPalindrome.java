package com.leetcode.easy;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    String replaced = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().trim();
    int length = replaced.length();
    int lastIndex = length - 1;
    for (int i = 0; i < length / 2; i++) {
      if (replaced.charAt(i) != replaced.charAt(lastIndex - i)) {
        return false;
      }
    }
    return true;
  }
}
