package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOf1BitsTest {

  private final NumberOf1Bits classUnderTest = new NumberOf1Bits();

  @ParameterizedTest
  @CsvSource({
    "00000000000000000000000000001011, 3",
    "00000000000000000000000010000000, 1",
    "11111111111111111111111111111101, 31"
  })
  void testOutputOf3(String binaryString, int expected) {
    int input = convertStringToTowsComplement(binaryString);

    int result = classUnderTest.hammingWeight(input);
    assertThat(result).isEqualTo(expected);
  }

  private int convertStringToTowsComplement(String binaryString) {
    return (int) Long.parseLong(binaryString, 2);
  }
}