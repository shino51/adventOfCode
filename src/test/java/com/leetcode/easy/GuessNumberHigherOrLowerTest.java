package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class GuessNumberHigherOrLowerTest {

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of(10, 6),
      Arguments.of(9, 6),
      Arguments.of(2, 1),
      Arguments.of(2, 2),
      Arguments.of(1, 1)
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void test(int range, int picked) {
    GuessNumberHigherOrLower classUnderTest = new GuessNumberHigherOrLower(picked);
    assertThat(classUnderTest.guessNumber(range)).isEqualTo(picked);
  }
}