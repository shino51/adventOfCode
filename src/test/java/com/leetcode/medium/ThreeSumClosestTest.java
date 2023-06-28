package com.leetcode.medium;

import com.leetcode.medium.ThreeSumClosest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeSumClosestTest {

  private final ThreeSumClosest threeSumClosest = new ThreeSumClosest();

  @Test
  public void whenOnlyThreeInputProvidedAndOutputIsEqualsToTarget() {
    int[] input = {-1, 1, 1};
    int target = 1;
    int result = threeSumClosest.threeSumClosest(input, target);

    assertThat(result).isEqualTo(1);
  }

  @Test
  public void whenOnlyThreeInputProvided() {
    int[] input = {-1, 1, 2};
    int target = 2;
    int result = threeSumClosest.threeSumClosest(input, target);

    assertThat(result).isEqualTo(2);
  }

  @Test
  public void whenMultipleInputProvided() {
    int[] input = {-1, 2, 1, -4};
    int target = 2;
    int result = threeSumClosest.threeSumClosest(input, target);

    assertThat(result).isEqualTo(2);
  }

  @Test
  public void whenAllTheSameNumberProvided() {
    int[] input = {0, 0, 0};
    int target = 1;
    int result = threeSumClosest.threeSumClosest(input, target);

    assertThat(result).isEqualTo(0);
  }
}