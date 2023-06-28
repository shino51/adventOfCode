package com.leetcode.easy;

import com.leetcode.easy.ContainerWithMostWater;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainerWithMostWaterTest {

  private final ContainerWithMostWater classUnderTest = new ContainerWithMostWater();

  @Test
  public void only2Entries() {
    int[] height = new int[]{1, 1};
    int result = classUnderTest.maxArea(height);
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void with3Entries() {
    int[] height = new int[]{2, 1, 2};
    int result = classUnderTest.maxArea(height);
    assertThat(result).isEqualTo(4);
  }

  @Test
  public void test2Complex() {
    int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    int result = classUnderTest.maxArea(height);
    assertThat(result).isEqualTo(49);
  }
}