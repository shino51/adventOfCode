package com.leetcode.easy;

import com.leetcode.easy.PascalsTriangle;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PascalsTriangleTest {

  private final PascalsTriangle classUnderTest = new PascalsTriangle();

  @Test
  public void row1() {
    List<List<Integer>> result = classUnderTest.generate(1);
    assertThat(result.toString()).isEqualTo("[[1]]");
  }

  @Test
  public void row2() {
    List<List<Integer>> result = classUnderTest.generate(2);
    assertThat(result.toString()).isEqualTo("[[1], [1, 1]]");
  }

  @Test
  public void row3() {
    List<List<Integer>> result = classUnderTest.generate(3);
    assertThat(result.toString()).isEqualTo("[[1], [1, 1], [1, 2, 1]]");
  }

  @Test
  public void row5() {
    List<List<Integer>> result = classUnderTest.generate(5);
    assertThat(result.toString()).isEqualTo("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
  }
}