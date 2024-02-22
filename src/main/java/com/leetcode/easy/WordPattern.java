package com.leetcode.easy;

import java.util.HashMap;

public class WordPattern {

  public boolean wordPattern(String pattern, String s) {
    char[] patternChars = pattern.toCharArray();
    String[] words = s.split(" ");
    if (patternChars.length != words.length) {
      return false;
    }
    var map = new HashMap<Character, String>();
    for (int i = 0; i < patternChars.length; i++) {
      char patternChar = patternChars[i];
      String word = words[i];
      if ((!map.containsKey(patternChar) && map.containsValue(word)) || (map.containsKey(patternChar) && !word.equals(map.get(patternChar)))) {
        return false;
      } else {
        map.put(patternChar, word);
      }
    }
    return true;
  }
}
