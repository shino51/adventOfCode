package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class UglyNumberTest {

  private final static UglyNumber uglyNumber = new UglyNumber();

  @ParameterizedTest(name = "[{index}] - input: ({0})  - is ugly number")
  @CsvSource({"6", "1", "8", "15"})
  void testIfNumberIsUgly(int input) {
    assertThat(uglyNumber.isUgly(input)).isTrue();
  }

  @ParameterizedTest(name = "[{index}] - input: ({0})  - is NOT ugly number")
  @CsvSource({"17", "0", "14"})
  void testIfNumberIsNotUgly(int input) {
    assertThat(uglyNumber.isUgly(input)).isFalse();
  }
}