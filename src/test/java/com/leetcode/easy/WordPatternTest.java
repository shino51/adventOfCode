package com.leetcode.easy;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class WordPatternTest {

  private final WordPattern wordPattern = new WordPattern();

  @ParameterizedTest
  @CsvSource({
    "abba,dog cat cat dog",
    "aa,dog dog"
  })
  void wordPatternReturnTrue(String pattern, String words) {
    assertThat(wordPattern.wordPattern(pattern, words)).isTrue();
  }

  @ParameterizedTest
  @CsvSource({
    "abba,dog cat cat egg",
    "aaaa,dog cat cat dog",
    "abba,dog dog dog dog"
  })
  void wordPatternReturnFalse(String pattern, String words) {
    assertThat(wordPattern.wordPattern(pattern, words)).isFalse();
  }


}