package com.leetcode.easy;

import com.leetcode.easy.ReverseBits;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ReverseBitsTest {

  private final ReverseBits classUnderTest = new ReverseBits();

  @Test
  public void whenInputIsNegativeAndOutputIsPositive() {
    int input = convertStringToTowsComplement("10000000000000000000000000000000");
    long result = classUnderTest.reverseBits(input);
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void whenInputIsPositiveAndOutputIsPositve() {
    int input = convertStringToTowsComplement("00000010100101000001111010011100");
    long result = classUnderTest.reverseBits(input);
    assertThat(result).isEqualTo(964176192);
  }

  @Test
  public void testInput() {
    int input = convertStringToTowsComplement("11111111111111111111111111111101");
    long result = classUnderTest.reverseBits(input);
    assertThat(result).isEqualTo(  3221225471L);
  }

  private int convertStringToTowsComplement(String binaryString) {
    return (int) Long.parseLong(binaryString, 2);
  }
}