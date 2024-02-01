package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {

  private ReverseInteger reverseInteger = new ReverseInteger();

  @ParameterizedTest
  @CsvSource({
    "123, 321",
    "-123, -321",
    "120, 21",
    "0, 0",
    "1534236469, 0",
    "-2147483648, 0"
  })
  void testReverseInteger(long input, long expected) {
    assertThat(reverseInteger.reverse((int) input)).isEqualTo((int) expected);
  }
}