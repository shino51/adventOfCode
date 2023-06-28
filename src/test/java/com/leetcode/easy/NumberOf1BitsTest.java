package com.leetcode.easy;

import com.leetcode.easy.NumberOf1Bits;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberOf1BitsTest {

  private final NumberOf1Bits classUnderTest = new NumberOf1Bits();

  @Test
  public void testOutputOf3() {
    int input = convertStringToTowsComplement("00000000000000000000000000001011");

    int result = classUnderTest.hammingWeight(input);
    assertThat(result).isEqualTo(3);
  }

  @Test
  public void testOutputOf1() {
    int input = convertStringToTowsComplement("00000000000000000000000010000000");

    int result = classUnderTest.hammingWeight(input);
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void testOutputOf31() {
    int input = convertStringToTowsComplement("11111111111111111111111111111101");

    int result = classUnderTest.hammingWeight(input);
    assertThat(result).isEqualTo(31);
  }

  private int convertStringToTowsComplement(String binaryString) {
    return (int) Long.parseLong(binaryString, 2);
  }
}