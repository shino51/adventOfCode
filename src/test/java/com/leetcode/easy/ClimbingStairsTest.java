package com.leetcode.easy;

import com.leetcode.easy.ClimbingStairs;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ClimbingStairsTest {
  private final ClimbingStairs classUnderTest = new ClimbingStairs();

  @Test
  public void test1() {
    assertThat(classUnderTest.climbStairs(0)).isEqualTo(0);
    assertThat(classUnderTest.climbStairs(1)).isEqualTo(1);
    assertThat(classUnderTest.climbStairs(2)).isEqualTo(2);
    assertThat(classUnderTest.climbStairs(3)).isEqualTo(3);
    assertThat(classUnderTest.climbStairs(4)).isEqualTo(5);
    assertThat(classUnderTest.climbStairs(5)).isEqualTo(8);
    assertThat(classUnderTest.climbStairs(40)).isEqualTo(165580141);
    assertThat(classUnderTest.climbStairs(45)).isEqualTo(1836311903);
  }
}