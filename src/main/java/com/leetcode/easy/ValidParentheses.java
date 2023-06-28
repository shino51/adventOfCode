package com.leetcode.easy;

import java.util.*;

public class ValidParentheses {

  /**
   * 1 <= s.length <= 104
   * s consists of parentheses only '()[]{}'.
   */
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }

    Map<Character, Character> combination = getCombinationCharacterMap();

    Stack<Character> expectedClosingBrackets = new Stack<>();
    for (char parentheses: s.toCharArray()) {
      Character closingBracket = combination.get(parentheses);
      if (expectedClosingBrackets.isEmpty()) {
        // continue if parentheses is opening bracket
        if (closingBracket == null) {
          return false;
        } else {
          // store matched closing bracket of the opening bracket
          expectedClosingBrackets.push(closingBracket);
        }
      } else if (closingBracket != null){
        // there is another opening bracket
        expectedClosingBrackets.push(closingBracket);
      } else {
        // return false if parentheses is not closing bracket
        if (expectedClosingBrackets.pop() != parentheses) {
          return false;
        }
      }
    }
    return expectedClosingBrackets.isEmpty();
  }

  private Map<Character, Character> getCombinationCharacterMap() {
    Map<Character, Character> combination = new HashMap<>();
    combination.put('(', ')');
    combination.put('{', '}');
    combination.put('[', ']');
    return combination;
  }
}
