package com.leetcode.easy;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseVowelsOfStringTest {

  private final ReverseVowelsOfString classUnderTest = new ReverseVowelsOfString();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of("hello", "holle"),
      Arguments.of("leetcode", "leotcede"),
      Arguments.of("aA", "Aa")
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void test(String input, String expected) {
    String output = classUnderTest.reverseVowels(input);
    assertThat(output).isEqualTo(expected);
  }


}