package com.leetcode.easy;

public class RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
    for (char character : ransomNote.toCharArray()) {
      int index = magazine.indexOf(character);
      if (index == -1) {
        return false;
      }
      // value exist
      magazine = magazine.substring(0, index) + magazine.substring(index + 1);
    }
    return true;
  }
}
