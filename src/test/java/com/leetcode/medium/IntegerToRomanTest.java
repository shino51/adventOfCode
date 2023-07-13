package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerToRomanTest {

  private final IntegerToRoman classUnderTest = new IntegerToRoman();

  @ParameterizedTest
  @CsvSource({
    "1, I",
    "3, III",
    "4, IV",
    "5, V",
    "9, IX",
    "58, LVIII",
    "1994, MCMXCIV"
  })
  void test(int input, String expected) {
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo(expected);
  }
}