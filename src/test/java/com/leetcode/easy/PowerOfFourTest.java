package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PowerOfFourTest {

  private final PowerOfFour powerOfFour = new PowerOfFour();

  @ParameterizedTest
  @CsvSource({
    "16", "4", "1"
  })
  void testIfPowerOfFour(int input) {
    Assertions.assertTrue(powerOfFour.isPowerOfFour(input));
  }

  @ParameterizedTest
  @CsvSource({
    "2", "5", "32"
  })
  void testIfNotPowerOfFour(int input) {
    Assertions.assertFalse(powerOfFour.isPowerOfFour(input));
  }

}