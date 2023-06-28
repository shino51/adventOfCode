package com.leetcode.easy;

import com.leetcode.easy.MergeSortedArray;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortedArrayTest {
  private final MergeSortedArray classUnderTest = new MergeSortedArray();

  @Test
  public void test1() {
    int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
    int[] num2 = new int[]{2, 5, 6};
    classUnderTest.merge(num1, 3, num2, 3);
    assertThat(num1[0]).isEqualTo(1);
    assertThat(num1[1]).isEqualTo(2);
    assertThat(num1[2]).isEqualTo(2);
    assertThat(num1[3]).isEqualTo(3);
    assertThat(num1[4]).isEqualTo(5);
    assertThat(num1[5]).isEqualTo(6);
  }

  @Test
  public void test2() {
    int[] num1 = new int[]{1};
    int[] num2 = new int[0];
    classUnderTest.merge(num1, 1, num2, 0);
    assertThat(num1[0]).isEqualTo(1);
  }

  @Test
  public void test3() {
    int[] num1 = new int[]{0};
    int[] num2 = new int[]{1};
    classUnderTest.merge(num1, 0, num2, 1);
    assertThat(num1[0]).isEqualTo(1);
  }
}