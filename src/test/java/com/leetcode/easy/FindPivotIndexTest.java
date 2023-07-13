package com.leetcode.easy;

import com.leetcode.easy.FindPivotIndex;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FindPivotIndexTest {
  public final FindPivotIndex classUnderTest = new FindPivotIndex();

  @Test
  public void findPivot() {
    int[] input = {1,7,3,6,5,6};
    int output = classUnderTest.pivotIndex(input);
    assertThat(output).isEqualTo(3);
  }

  @Test
  public void whenNoMatchingValue() {
    int[] input = {1,2,3};
    int output = classUnderTest.pivotIndex(input);
    assertThat(output).isEqualTo(-1);
  }

  @Test
  public void whenIndex0() {
    int[] input = {2,1,-1};
    int output = classUnderTest.pivotIndex(input);
    assertThat(output).isZero();
  }

  @Test
  public void whenAllMinusValue() {
    int[] input = {-1,-1,-1,-1,-1,-1};
    int output = classUnderTest.pivotIndex(input);
    assertThat(output).isEqualTo(-1);
  }

}