package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterInStringTest {

  private final FirstUniqueCharacterInString classUnderTest = new FirstUniqueCharacterInString();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of("leetcode", 0),
      Arguments.of("loveleetcode", 2),
      Arguments.of("aabb", -1)
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void test(String input, int output) {
    assertThat(classUnderTest.firstUniqueChar(input)).isEqualTo(output);
  }
}