package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MissingNumberTest {

  private static final MissingNumber missingNumber = new MissingNumber();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new int[]{0, 2}, 1),
      Arguments.of(new int[]{3, 0, 1}, 2),
      Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8),
      Arguments.of(new int[]{8, 6, 4, 2, 3, 5, 7, 0, 1}, 9)
    );
  }

  @ParameterizedTest
  @MethodSource("provideArguments")
  void test(int[] input, int expected) {
    int result = missingNumber.missingNumber(input);
    assertThat(result).isEqualTo(expected);
  }
}