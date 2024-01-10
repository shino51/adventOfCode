package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AddDigitsTest {

  private final AddDigits addDigits = new AddDigits();

  @ParameterizedTest
  @CsvSource({
    "38, 2",
    "11, 2",
    "19, 1"
  })
  void addDigitsTest(int input, int expected) {
    assertThat(addDigits.addDigits(input)).isEqualTo(expected);
  }
}