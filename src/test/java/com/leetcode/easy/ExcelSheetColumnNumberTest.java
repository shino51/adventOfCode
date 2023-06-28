package com.leetcode.easy;

import com.leetcode.easy.ExcelSheetColumnNumber;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExcelSheetColumnNumberTest {

  private final ExcelSheetColumnNumber classUnderTest = new ExcelSheetColumnNumber();

  @Test
  public void AConvertTo1() {
    String input = "A";
    int result = classUnderTest.titleToNumber(input);
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void ABConvertTo28() {
    String input = "AB";
    int result = classUnderTest.titleToNumber(input);
    assertThat(result).isEqualTo(28);
  }

  @Test
  public void BAConvertTo53() {
    String input = "BA";
    int result = classUnderTest.titleToNumber(input);
    assertThat(result).isEqualTo(53);
  }

  @Test
  public void ZYConvertTo701() {
    String input = "ZY";
    int result = classUnderTest.titleToNumber(input);
    assertThat(result).isEqualTo(701);
  }
}