package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

  private static final String OPEN_PARENTHESES = "(";
  private static final String CLOSE_PARENTHESES = ")";

  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    addParentheses(result, OPEN_PARENTHESES, 1, 0, n);
    return result;
  }

  private void addParentheses(List<String> result, String contents, int openParenthesesNum, int closeParenthesesNum, int n) {

    if (openParenthesesNum != n && openParenthesesNum <= n) {
      // openParenthesesNum can still be added
      addParentheses(result, contents + OPEN_PARENTHESES, openParenthesesNum + 1, closeParenthesesNum, n);
    }
    if (closeParenthesesNum < openParenthesesNum) {
      addParentheses(result, contents + CLOSE_PARENTHESES, openParenthesesNum, closeParenthesesNum + 1, n);
    }
    if (closeParenthesesNum == n) {
      result.add(contents);
    }
  }
}
