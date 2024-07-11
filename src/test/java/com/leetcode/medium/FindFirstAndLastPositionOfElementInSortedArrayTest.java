package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

  private final FindFirstAndLastPositionOfElementInSortedArray classUnderTest = new FindFirstAndLastPositionOfElementInSortedArray();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}),
      Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1}),
      Arguments.of(new int[]{1, 4}, 4, new int[]{1, 1}),
      Arguments.of(new int[]{}, 0, new int[]{-1, -1}),
      Arguments.of(new int[]{1}, 1, new int[]{0, 0})
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void test(int[] nums, int target, int[] expected) {
    int[] result = classUnderTest.searchRange(nums, target);
    assertThat(result).containsExactly(expected);
  }


}