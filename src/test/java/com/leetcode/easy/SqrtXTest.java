package com.leetcode.easy;

import com.leetcode.easy.SqrtX;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SqrtXTest {

  private final SqrtX classUnderTest = new SqrtX();

  @Test
  public void test() {
    assertThat(classUnderTest.mySqrt(4)).isEqualTo(2);
    assertThat(classUnderTest.mySqrt(8)).isEqualTo(2);
    assertThat(classUnderTest.mySqrt(2)).isEqualTo(1);
    assertThat(classUnderTest.mySqrt(0)).isZero();
    assertThat(classUnderTest.mySqrt(5)).isEqualTo(2);
  }
}