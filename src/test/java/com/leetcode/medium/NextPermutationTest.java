package com.leetcode.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NextPermutationTest {

  private final NextPermutation nextPermutation = new NextPermutation();

  @Test
  public void from123To132() {
    int[] input = new int[]{1,2,3};
    int[] output = new int[]{1,3,2};

    nextPermutation.nextPermutation(input);
    assertThat(input).containsExactly(output);
  }

  @Test
  public void from132To213() {
    int[] input = new int[]{1,3,2};
    int[] output = new int[]{2,1,3};

    nextPermutation.nextPermutation(input);
    assertThat(input).containsExactly(output);
  }

  @Test
  public void whenNumberAtLexicographicalLarge() {
    int[] input = new int[]{3,2,1};
    int[] output = new int[]{1,2,3};

    nextPermutation.nextPermutation(input);
    assertThat(input).containsExactly(output);
  }
}