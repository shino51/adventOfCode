package com.leetcode.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NumArrayTest {

  @Test
  public void testWithSumRange() {
    NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    assertThat(numArray.sumRange(0, 2)).isEqualTo(1); // return (-2) + 0 + 3 = 1
    assertThat(numArray.sumRange(2, 5)).isEqualTo(-1); // return 3 + (-5) + 2 + (-1) = -1
    assertThat(numArray.sumRange(0, 5)).isEqualTo(-3); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
  }
}