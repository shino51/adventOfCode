package com.leetcode.easy;

import com.leetcode.easy.PlusOne;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PlusOneTest {

  private final PlusOne classUnderTest = new PlusOne();

  @Test
  public void testWhenNoCarry() {
    int[] input = new int[]{1,2,3};
    int[] output = classUnderTest.plusOne(input);
    assertThat(output[0]).isEqualTo(1);
    assertThat(output[1]).isEqualTo(2);
    assertThat(output[2]).isEqualTo(4);
  }

  @Test
  public void testWhenCarry() {
    int[] input = new int[]{9};
    int[] output = classUnderTest.plusOne(input);
    assertThat(output[0]).isEqualTo(1);
    assertThat(output[1]).isEqualTo(0);
  }

  @Test
  public void testWhenCarryWithLargerNumber() {
    int[] input = new int[]{9,9,9};
    int[] output = classUnderTest.plusOne(input);
    assertThat(output[0]).isEqualTo(1);
    assertThat(output[1]).isEqualTo(0);
    assertThat(output[2]).isEqualTo(0);
    assertThat(output[3]).isEqualTo(0);
  }

  @Test
  public void testWhenInputIsZero() {
    int[] input = new int[]{0};
    int[] output = classUnderTest.plusOne(input);
    assertThat(output).hasSize(1);
    assertThat(output[0]).isEqualTo(1);
  }
}