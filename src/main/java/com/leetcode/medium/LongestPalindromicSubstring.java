package com.leetcode.medium;

public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    String longestString = Character.toString(s.charAt(0));
    int longestLength = 1;
    for (int i = 0; i < s.length() - 1; i++) {
      char startingChar = s.charAt(i);
      String remainingString = s.substring(i + 1);
      if (remainingString.length() < longestLength) {
        continue;
      }
      while (remainingString.contains(Character.toString(startingChar))) {
        int lastIndex = remainingString.lastIndexOf(startingChar) + i + 1;
        String possibleSubstring = s.substring(i, lastIndex + 1);
        if (isStringPalindrome(possibleSubstring) && possibleSubstring.length() > longestLength) {
          longestLength = possibleSubstring.length();
          longestString = possibleSubstring;
        }
        remainingString = s.substring(i + 1, lastIndex);
      }

    }
    return longestString;
  }

  private boolean isStringPalindrome(String s) {
    return s.equals(new StringBuilder(s).reverse().toString());
  }
}
