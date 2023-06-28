package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingChars {
  public int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    int longestSubstringLength = 1;
    for (int i = 0; i < s.length(); i++) {
      List<Character> appearedChar = new ArrayList<>();
      appearedChar.add(s.charAt(i));
      int currentStringLength = 1;
      if (s.length() - i <= longestSubstringLength) {
        return longestSubstringLength;
      }
      for (int j = i + 1; j < s.length(); j++) {
        char lastIndex = s.charAt(j);
        if (appearedChar.contains(lastIndex)) {
          break;
        } else {
          appearedChar.add(lastIndex);
          currentStringLength++;
        }
      }
      longestSubstringLength = Math.max(longestSubstringLength, currentStringLength);
    }
    return longestSubstringLength;
  }
}
