package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FirstBadVersionTest {

  private final FirstBadVersion classUnderTest = new FirstBadVersion();

  @ParameterizedTest
  @CsvSource({
    "5, 4",
    "6 , 4",
    "1, 1"
  })
  void test(int n, int bad) {
    assertThat(classUnderTest.solution(n, bad)).isTrue();
  }
}