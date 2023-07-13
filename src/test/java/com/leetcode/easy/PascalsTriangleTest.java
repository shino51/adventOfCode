package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PascalsTriangleTest {

  private final PascalsTriangle classUnderTest = new PascalsTriangle();

  @ParameterizedTest
  @CsvSource({
    "1, '[[1]]'",
    "2, '[[1], [1, 1]]'",
    "3, '[[1], [1, 1], [1, 2, 1]]'",
    "5, '[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]'"
  })
  void test(int input, String expected) {
    List<List<Integer>> result = classUnderTest.generate(input);
    assertThat(result).hasToString(expected);
  }
}