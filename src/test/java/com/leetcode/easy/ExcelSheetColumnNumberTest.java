package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ExcelSheetColumnNumberTest {

  private final ExcelSheetColumnNumber classUnderTest = new ExcelSheetColumnNumber();

  @ParameterizedTest
  @CsvSource({"A,1", "AB,28", "BA,53", "ZY, 701"})
  void AConvertTo1(String input, int expected) {
    int result = classUnderTest.titleToNumber(input);
    assertThat(result).isEqualTo(expected);
  }
}