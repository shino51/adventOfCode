package com.leetcode.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationSumTest {

  private final CombinationSum classUnderTest = new CombinationSum();

  @Test
  public void test1() {
    int[] candidates = new int[]{2, 3, 6, 7};
    List<List<Integer>> output = classUnderTest.combinationSum(candidates, 7);
    assertThat(output).hasSize(2)
      .contains(Arrays.asList(3, 2, 2))
      .contains(Collections.singletonList(7));
  }

  @Test
  public void test2() {
    int[] candidates = new int[]{2, 3, 5};
    List<List<Integer>> output = classUnderTest.combinationSum(candidates, 8);
    assertThat(output).hasSize(3)
      .contains(Arrays.asList(2, 2, 2, 2))
      .contains(Arrays.asList(3, 3, 2))
      .contains(Arrays.asList(5, 3));
  }

  @Test
  public void test3() {
    int[] candidates = new int[]{8, 7, 4, 3};
    List<List<Integer>> output = classUnderTest.combinationSum(candidates, 11);
    assertThat(output).hasSize(3)
      .contains(Arrays.asList(8, 3))
      .contains(Arrays.asList(7, 4))
      .contains(Arrays.asList(4, 4, 3));
  }

  @Test
  public void test4() {
    int[] candidates = new int[]{7, 3, 2};
    List<List<Integer>> output = classUnderTest.combinationSum(candidates, 18);
    assertThat(output).hasSize(7)
      .contains(Arrays.asList(7, 7, 2, 2))
      .contains(Arrays.asList(7, 3, 3, 3, 2))
      .contains(Arrays.asList(7, 3, 2, 2, 2, 2))
      .contains(Arrays.asList(3, 3, 3, 3, 3, 3))
      .contains(Arrays.asList(3, 3, 3, 3, 2, 2, 2))
      .contains(Arrays.asList(3, 3, 2, 2, 2, 2, 2, 2))
      .contains(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2));
  }
}