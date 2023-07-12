package com.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FourSumTest {

  private final FourSum classUnderTest = new FourSum();

  @Test
  public void whenAllSameNumberAndOnlyFourValues() {
    int[] nums = new int[]{2, 2, 2, 2};
    int target = 8;
    List<List<Integer>> result = classUnderTest.fourSum(nums, target);
    assertThat(result).hasSize(1);
    assertThat(result.get(0)).contains(2, 2, 2, 2);
  }

  @Test
  public void whenAllSameNumberAndFiveValues() {
    int[] nums = new int[]{2, 2, 2, 2, 2};
    int target = 8;
    List<List<Integer>> result = classUnderTest.fourSum(nums, target);
    assertThat(result).hasSize(1);
    assertThat(result.get(0)).contains(2, 2, 2, 2);
  }

  @Test
  public void whenDifferentNumbersAndSixValues() {
    int[] nums = new int[]{1, 0, -1, 0, -2, 2};
    int target = 0;
    List<List<Integer>> result = classUnderTest.fourSum(nums, target);
    assertThat(result).hasSize(3);
    assertThat(result.get(0)).contains(-2, -1, 1, 2);
    assertThat(result.get(1)).contains(-2, 0, 0, 2);
    assertThat(result.get(2)).contains(-1, 0, 0, 1);
  }

  @Test
  public void whenManyValuesProvided() {
    int[] nums = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
      20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20,
      30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
      40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40,
      50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50,
      60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
      70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70,
      80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80,
      90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
    int target = 200;
    List<List<Integer>> result = classUnderTest.fourSum(nums, target);
    assertThat(result).hasSize(33);
  }

  @Test
  public void test() {
    int[] nums = new int[]{-5,-4,-3,-2,-1,0,0,1,2,3,4,5};
    int target = 0;
    List<List<Integer>> result = classUnderTest.fourSum(nums, target);
    assertThat(result).hasSize(29);
  }
}