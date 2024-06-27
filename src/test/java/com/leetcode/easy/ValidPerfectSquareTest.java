package com.leetcode.easy;

import org.junit.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ValidPerfectSquareTest {

  private final ValidPerfectSquare classUnderTest = new ValidPerfectSquare();

  private static Stream<Arguments> provideArguments() {
      return Stream.of(
        Arguments.of(16, true),
        Arguments.of(1, true),
        Arguments.of(4, true),
        Arguments.of(14, false),
        Arguments.of(20, false)
      );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void test(int input, boolean isPerfectSquare) {
    assertThat(classUnderTest.isPerfectSquare(input)).isEqualTo(isPerfectSquare);
  }


}