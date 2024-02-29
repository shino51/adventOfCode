package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NimGameTest {

  private final static NimGame nimGame = new NimGame();

  @ParameterizedTest
  @CsvSource({
    "4, false",
    "1, true",
    "2, true",
    "5, true",
    "7, true",
    "8, false"
  })
  void testCanWinNum(int input, boolean result) {
    assertThat(nimGame.canWinNim(input)).isEqualTo(result);
  }
}