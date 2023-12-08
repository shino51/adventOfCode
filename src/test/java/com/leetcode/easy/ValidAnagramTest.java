package com.leetcode.easy;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ValidAnagramTest {

  private final ValidAnagram validAnagram = new ValidAnagram();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of("anagram", "nagaram", true),
      Arguments.of("rat", "cat", false)
    );
  }

  @ParameterizedTest(name="[{index}] - ({0}) and ({1}) - expect: {2}")
  @MethodSource("provideArguments")
  void testIfAnagram(String s, String t, boolean expectedResult) {
    assertThat(validAnagram.isAnagram(s, t)).isEqualTo(expectedResult);
  }
}