package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NextPermutationTest {

  private final NextPermutation nextPermutation = new NextPermutation();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new int[]{1, 2, 3}, new int[]{1, 3, 2}),
      Arguments.of(new int[]{1, 1, 5}, new int[]{1, 5, 1}),
      Arguments.of(new int[]{3, 2, 1}, new int[]{1, 2, 3}),
      Arguments.of(new int[]{1, 3, 2}, new int[]{2, 1, 3})

    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void testNextPermutation(int[] input, int[] expected) {
    nextPermutation.nextPermutation(input);
    assertThat(input).containsExactly(expected);
  }
}