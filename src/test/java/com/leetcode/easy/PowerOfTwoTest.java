package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class PowerOfTwoTest {

  private final PowerOfTwo powerOfTwo = new PowerOfTwo();


  @ParameterizedTest
  @CsvSource({
    "0, false",
    "1, true",
    "2, true",
    "16, true",
    "3, false",
    "8, true",
    "9, false"
  })
  void testToThePowerOf2(int input, boolean expected) {
    boolean result = powerOfTwo.isPowerOfTwo(input);
    assertThat(result).isEqualTo(expected);
  }

}