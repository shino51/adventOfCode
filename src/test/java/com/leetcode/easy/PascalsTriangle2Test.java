package com.leetcode.easy;

import com.leetcode.easy.PascalsTriangle2;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PascalsTriangle2Test {

  private final PascalsTriangle2 classUnderTest = new PascalsTriangle2();

  @Test
  public void testReturn1() {
    List<Integer> result = classUnderTest.getRow(0);
    assertThat(result.toString()).isEqualTo("[1]");
  }

  @Test
  public void testReturn2() {
    List<Integer> result = classUnderTest.getRow(3);
    assertThat(result.toString()).isEqualTo("[1, 3, 3, 1]");
  }

  @Test
  public void testReturn3() {
    List<Integer> result = classUnderTest.getRow(10);
    assertThat(result.toString()).isEqualTo("[1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1]");
  }
}