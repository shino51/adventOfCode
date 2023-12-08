package com.leetcode.easy;

import java.util.Arrays;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    int length = s.length();
    if (length != t.length()) {
      return false;
    }
    char[] sCharArray = s.toCharArray();
    char[] tCharArray = t.toCharArray();

    Arrays.sort(sCharArray);
    Arrays.sort(tCharArray);

    for (int i = 0; i < length; i++) {
      if (sCharArray[i] != tCharArray[i]) {
        return false;
      }
    }
    return true;
  }
}
