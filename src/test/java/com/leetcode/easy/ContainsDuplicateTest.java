package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ContainsDuplicateTest {

  private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

  @Test
  void onlyOneNumber() {
    int[] input = new int[] {1};
    boolean isContainsDuplicate = containsDuplicate.containsDuplicate(input);
    assertThat(isContainsDuplicate).isFalse();
  }

  @Test
  void duplicateWithTwoNumber() {
    int[] input = new int[] {1, 1};
    boolean isContainsDuplicate = containsDuplicate.containsDuplicate(input);
    assertThat(isContainsDuplicate).isTrue();
  }

  @Test
  void noDuplicateNumber() {
    int[] input = new int[] {1,2,3,4};
    boolean isContainsDuplicate = containsDuplicate.containsDuplicate(input);
    assertThat(isContainsDuplicate).isFalse();
  }

  @Test
  void manyDuplicateNumbers() {
    int[] input = new int[] {1,1,1,3,3,4,3,2,4,2};
    boolean isContainsDuplicate = containsDuplicate.containsDuplicate(input);
    assertThat(isContainsDuplicate).isTrue();
  }
}