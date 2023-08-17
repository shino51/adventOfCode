package com.leetcode.easy;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainDuplicate2Test {

  private final ContainDuplicate2 containDuplicate2 = new ContainDuplicate2();

  @Test
  void whenOnlyTwoNumsAndDuplicated() {
    int[] nums = new int[]{1, 1};
    int k = 1;
    assertThat(containDuplicate2.containsNearbyDuplicate(nums, k)).isTrue();
  }

  @Test
  void whenOnlyTwoNumsAndNotDuplicated() {
    int[] nums = new int[]{1, 2};
    int k = 1;
    assertThat(containDuplicate2.containsNearbyDuplicate(nums, k)).isFalse();
  }

  @Test
  void when4NumbersDuplicated() {
    int[] nums = new int[]{1, 2, 3, 1};
    int k = 3;
    assertThat(containDuplicate2.containsNearbyDuplicate(nums, k)).isTrue();
  }

  @Test
  void when4NumbersNotDuplicated() {
    int[] nums = new int[]{1, 2, 3, 4};
    int k = 3;
    assertThat(containDuplicate2.containsNearbyDuplicate(nums, k)).isFalse();
  }

  @Test
  void whenDuplicateExistButNotInRange() {
    int[] nums = new int[]{1, 2, 3, 1, 2, 3};
    int k = 2;
    assertThat(containDuplicate2.containsNearbyDuplicate(nums, k)).isFalse();
  }
}