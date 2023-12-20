package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfSegmentsInStringTest {

  private final NumberOfSegmentsInString classUnderTest = new NumberOfSegmentsInString();

  @ParameterizedTest
  @CsvSource({
    "'Hello, my name is John', 5",
    "Hello, 1",
    "'          ', 0",
    "', , , ,        a, eaefa', 6"
  })
  void test(String input, int expected) {
    assertThat(classUnderTest.countSegments(input)).isEqualTo(expected);
  }

}