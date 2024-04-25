package com.leetcode.easy;

public class ReverseString {
  public void reverseString(char[] s) {
    int size = s.length - 1;
    for (int i = 0; i <= size / 2; i++) {
      //swap char
      var tmp = s[i];
      s[i] = s[size - i];
      s[size - i] = tmp;
    }
  }
}
