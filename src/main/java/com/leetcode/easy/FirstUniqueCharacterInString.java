package com.leetcode.easy;

public class FirstUniqueCharacterInString {
  public int firstUniqueChar(String s) {
    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
        // found unique
        return i;
      }
    }
    return -1;
  }
}
