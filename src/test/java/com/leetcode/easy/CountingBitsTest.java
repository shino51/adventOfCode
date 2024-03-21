package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountingBitsTest {
  private final CountingBits countingBits = new CountingBits();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(2, new int[]{0, 1, 1}),
      Arguments.of(5, new int[]{0, 1, 1, 2, 1, 2}),
      Arguments.of(20, new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2})
    );
  }

  @ParameterizedTest
  @MethodSource("provideArguments")
  void test(int input, int[] expectedOutput) {
    int[] output = countingBits.countBits(input);
    assertThat(output).containsExactly(expectedOutput);
  }
}