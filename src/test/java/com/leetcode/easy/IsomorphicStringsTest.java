package com.leetcode.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsomorphicStringsTest {

  private final IsomorphicStrings classUnderTest = new IsomorphicStrings();

  @Test
  public void whenThreeStringIsmorphicString() {
    String input1 = "egg";
    String input2 = "add";
    boolean result = classUnderTest.isIsomorphic(input1, input2);

    assertThat(result).isTrue();
  }

  @Test
  public void whenStringIsNotMorphicString() {
    String input1 = "foo";
    String input2 = "bar";
    boolean result = classUnderTest.isIsomorphic(input1, input2);

    assertThat(result).isFalse();
  }

  @Test
  public void whenStringAppearsTwiceAndIsMorphicString() {
    String input1 = "paper";
    String input2 = "title";
    boolean result = classUnderTest.isIsomorphic(input1, input2);

    assertThat(result).isTrue();
  }

  @Test
  public void whenFirstInputIsIdenticalButNotSecondInput() {
    String input1 = "badc";
    String input2 = "baba";
    boolean result = classUnderTest.isIsomorphic(input1, input2);

    assertThat(result).isFalse();
  }



}