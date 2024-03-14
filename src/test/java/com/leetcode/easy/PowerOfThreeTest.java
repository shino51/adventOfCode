package com.leetcode.easy;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class PowerOfThreeTest {

  private final PowerOfThree powerOfThree = new PowerOfThree();

  @ParameterizedTest
  @CsvSource({
    "27, true",
    "0, false",
    "-1, false",
    "4, false",
    "9, true"
  })
  void testIsPowerOfThree(int input, boolean expected) {
    assertThat(powerOfThree.isPowerOfThree(input)).isEqualTo(expected);
  }
}