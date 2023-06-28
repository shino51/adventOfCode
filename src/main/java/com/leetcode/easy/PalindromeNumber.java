package com.leetcode.easy;

/*
-231 <= x <= 231 - 1
 */
public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    String strX = "" + x;
    String reversedString = new StringBuilder(strX).reverse().toString();
    return strX.equals(reversedString);
  }
}
