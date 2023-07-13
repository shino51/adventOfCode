package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ZigzagConversionTest {

  private static final ZigzagConversion classUnderTest = new ZigzagConversion();

  @ParameterizedTest
  @CsvSource({
    "P, 3, P",
    "ABC, 3, ABC",
    "ABCDE, 2, ACEBD",
    "ABCDEFGHIJ, 3, AEIBDFHJCG",
    "PAYPALISHIRING, 1, PAYPALISHIRING"
  })
  void test(String input, int numRows, String expected) {
    String result = classUnderTest.convert(input, numRows);
    assertThat(result).isEqualTo(expected);
  }
}