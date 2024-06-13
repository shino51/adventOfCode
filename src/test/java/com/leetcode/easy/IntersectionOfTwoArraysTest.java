package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionOfTwoArraysTest {

  private final IntersectionOfTwoArrays classUnderTest = new IntersectionOfTwoArrays();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2}),
      Arguments.of(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9})
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - {1}, expect: {2}")
  @MethodSource("provideArguments")
  void test(int[] nums1, int[] nums2, int[] expected) {
    int[] result = classUnderTest.intersection(nums1, nums2);
    assertThat(result).containsExactlyInAnyOrder(expected);
  }
}