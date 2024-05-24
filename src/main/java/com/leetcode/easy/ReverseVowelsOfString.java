package com.leetcode.easy;

public class ReverseVowelsOfString {

  public String reverseVowels(String s) {
    String vowels = "AIUEOaiueo";
    int length = s.length();
    char[] stringCharArray = s.toCharArray();
    int leftIndex = 0;
    int rightIndex = length - 1;
    while (leftIndex < rightIndex) {
      char currentLeftChar = stringCharArray[leftIndex];
      if (vowels.indexOf(currentLeftChar) == -1) {
        leftIndex++;
      } else {
        boolean vowelFound = false;
        while (!vowelFound && leftIndex < rightIndex) {
          char currentRightChar = stringCharArray[rightIndex];
          if (vowels.indexOf(currentRightChar) == -1) {
            rightIndex--;
          } else {
            stringCharArray[rightIndex] = currentLeftChar;
            stringCharArray[leftIndex] = currentRightChar;
            vowelFound = true;
            rightIndex--;
          }
        }
        leftIndex++;
      }
    }
    return String.valueOf(stringCharArray);
  }
}
