package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {

  private final MoveZeroes moveZeroes = new MoveZeroes();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
      Arguments.of(new int[]{0}, new int[]{0})
    );
  }

  @ParameterizedTest
  @MethodSource("provideArguments")
  void moveZeroes(int[] nums, int[] expected) {
    moveZeroes.moveZeroes(nums);
    assertThat(nums).containsExactly(expected);
  }
}