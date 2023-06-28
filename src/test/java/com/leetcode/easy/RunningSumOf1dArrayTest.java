package com.leetcode.easy;

import com.leetcode.easy.RunningSumOf1dArray;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RunningSumOf1dArrayTest {

  private final RunningSumOf1dArray classUnderTest = new RunningSumOf1dArray();

  @Test
  public void test1() {
    int[] input = {1,2,3,4};
    int[] output = classUnderTest.runningSum(input);

    assertThat(output).containsExactly(1,3,6,10);
  }

  @Test
  public void test2() {
    int[] input = {1,1,1,1,1};
    int[] output = classUnderTest.runningSum(input);

    assertThat(output).containsExactly(1,2,3,4,5);
  }

}