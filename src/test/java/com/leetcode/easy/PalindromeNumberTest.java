package com.leetcode.easy;

import com.leetcode.easy.PalindromeNumber;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PalindromeNumberTest {
  private PalindromeNumber classUnderTest = new PalindromeNumber();

  @Test
  public void test() {
    assertThat(classUnderTest.isPalindrome(121), is(true));
    assertThat(classUnderTest.isPalindrome(-121), is(false));
    assertThat(classUnderTest.isPalindrome(10), is(false));
    assertThat(classUnderTest.isPalindrome(101), is(true));
    assertThat(classUnderTest.isPalindrome(225), is(false));
    assertThat(classUnderTest.isPalindrome(0), is(true));
  }
}