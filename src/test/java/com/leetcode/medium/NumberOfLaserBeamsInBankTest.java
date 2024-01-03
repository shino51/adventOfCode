package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfLaserBeamsInBankTest {
  
  private final NumberOfLaserBeamsInBank numberOfLaserBeamsInBank = new NumberOfLaserBeamsInBank();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new String[]{"011001","000000","010100","001000"}, 8),
      Arguments.of(new String[]{"000","111","000"}, 0),
      Arguments.of(new String[]{"000","111","111"}, 9)
    );
  }

  @ParameterizedTest(name="[{index}] - input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void testIfAnagram(String[] input, int expectedResult) {
    assertThat(numberOfLaserBeamsInBank.numberOfBeams(input)).isEqualTo(expectedResult);
  }
}