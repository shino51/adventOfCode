package com.leetcode.easy;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    StringBuilder possiblePrefix = new StringBuilder(strs[0]);
    for(String oneString: strs) {
      if (oneString == strs[0]) {
        continue;
      }
      StringBuilder temp = new StringBuilder();
      for(int i = 0; i < oneString.length() && possiblePrefix.length() > i; i++) {
        char ch = oneString.charAt(i);
        if (ch == possiblePrefix.charAt(i)) {
          temp.append(ch);
        } else {
          break;
        }
      }
      possiblePrefix = temp;
    }
    return possiblePrefix.toString();
  }
}
