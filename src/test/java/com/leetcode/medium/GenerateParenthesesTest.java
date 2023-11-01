package com.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateParenthesesTest {

  private final GenerateParentheses generateParentheses = new GenerateParentheses();

  @Test
  public void testWithOneParentheses() {
    int n = 1;
    List<String> result = generateParentheses.generateParenthesis(n);
    assertThat(result).hasSize(1).containsExactly("()");
  }

  @Test
  public void testWithThreeN() {
    int n = 3;
    List<String> result = generateParentheses.generateParenthesis(n);
    assertThat(result).hasSize(5).containsExactly("((()))","(()())","(())()","()(())","()()()");
  }

  @Test
  public void testWithFourN() {
    int n = 4;
    List<String> result = generateParentheses.generateParenthesis(n);
    assertThat(result).hasSize(14).containsExactly("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()");
  }
}