package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNoteTest {

  private final RansomNote classUnderTest = new RansomNote();

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
      Arguments.of("a", "b", false),
      Arguments.of("a", "ab", true),
      Arguments.of("aa", "ab", false),
      Arguments.of("aa", "ab", false),
      Arguments.of("aa", "aab", true)
    );
  }

  @ParameterizedTest(name = "[{index}]: input: {0} - expect: {1}")
  @MethodSource("provideArguments")
  void test(String ransomNote, String magazine, boolean result) {
    assertThat(classUnderTest.canConstruct(ransomNote, magazine)).isEqualTo(result);
  }


}