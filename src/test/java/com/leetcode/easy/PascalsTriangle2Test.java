package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PascalsTriangle2Test {

  private final PascalsTriangle2 classUnderTest = new PascalsTriangle2();

  @ParameterizedTest
  @CsvSource({"0, '[1]'", "3, '[1, 3, 3, 1]'", "10, '[1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1]'"})
  void testReturn1(int input, String expected) {
    List<Integer> result = classUnderTest.getRow(input);
    assertThat(result).hasToString(expected);
  }
}