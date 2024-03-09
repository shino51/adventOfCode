package com.leetcode.medium;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerWithMostWaterTest {

  private final ContainerWithMostWater classUnderTest = new ContainerWithMostWater();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(new int[]{1, 1}, 1),
      Arguments.of(new int[]{2, 1, 2}, 4),
      Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49)
    );
  }

  @ParameterizedTest
  @MethodSource("provideArguments")
  void only2Entries(int[] height, int expectedResult) {
    int result = classUnderTest.maxArea(height);
    assertThat(result).isEqualTo(expectedResult);
  }
}