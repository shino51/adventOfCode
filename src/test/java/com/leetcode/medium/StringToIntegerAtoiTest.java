package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerAtoiTest {

  private final StringToIntegerAtoi classUnderTest = new StringToIntegerAtoi();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of("  -042", -42),
      Arguments.of("1337c0d3", 1337),
      Arguments.of("0-1", 0),
      Arguments.of("+4+2", 4),
      Arguments.of("++42", 0),
      Arguments.of("-91283472332", -2147483648),
      Arguments.of("   +0 123", 0),
      Arguments.of("-2147483647", -2147483647),
      Arguments.of("9223372036854775808", 2147483647),
      Arguments.of("words and 987", 0)
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void testAoi(String input, long expected) {
    int result = classUnderTest.myAtoi(input);
    assertThat(result).isEqualTo(expected);
  }
}