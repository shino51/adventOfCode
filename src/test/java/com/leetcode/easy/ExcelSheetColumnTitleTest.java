package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ExcelSheetColumnTitleTest {

  private final ExcelSheetColumnTitle classUnderTest = new ExcelSheetColumnTitle();

  @ParameterizedTest
  @CsvSource({
    "1, A",
    "26, Z",
    "27, AA",
    "28, AB",
    "52, AZ",
    "54, BB",
    "701, ZY",
    "702, ZZ",
    "703, AAA",
    "1000, ALL"
  })
  void test(int columnNumber, String expected) {
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo(expected);
  }
}