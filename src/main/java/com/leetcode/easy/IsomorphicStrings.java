package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
  public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char first = s.charAt(i);
      char second = t.charAt(i);

      if (!map.containsKey(first) && !map.containsValue(second)) {
        map.put(first, second);
      } else if (map.get(first) == null || map.get(first) != second) {
        return false;
      }
    }
    return true;
  }
}
