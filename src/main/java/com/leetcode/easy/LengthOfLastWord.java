package com.leetcode.easy;

public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    String[] words = s.trim().split(" ");
    String lastWord = words[words.length - 1];
    return lastWord.length();
  }
}
