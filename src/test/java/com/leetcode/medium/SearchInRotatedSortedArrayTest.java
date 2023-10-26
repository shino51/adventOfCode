package com.leetcode.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SearchInRotatedSortedArrayTest {

  private final SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

  @Test
  public void testWithOnlyOneInput() {
    int[] input = {1};
    int target = 0;
    int result = searchInRotatedSortedArray.search(input, target);
    assertThat(result).isEqualTo(-1);
  }

  @Test
  public void valueInRangeWith7Values() {
    int[] input = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    int result = searchInRotatedSortedArray.search(input, target);
    assertThat(result).isEqualTo(4);
  }

  @Test
  public void valueNotInRangeWith7Values() {
    int[] input = {4, 5, 6, 7, 0, 1, 2};
    int target = 3;
    int result = searchInRotatedSortedArray.search(input, target);
    assertThat(result).isEqualTo(-1);
  }

  @Test
  public void valueInRangeWith7Values_indexInTheLaterArray() {
    int[] input = {4, 5, 6, 7, 0, 1, 2};
    int target = 1;
    int result = searchInRotatedSortedArray.search(input, target);
    assertThat(result).isEqualTo(5);
  }

  @Test
  public void valueInRangeNotRotated() {
    int[] input = {1, 3, 5};
    int target = 3;
    int result = searchInRotatedSortedArray.search(input, target);
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void valueInRangeRotatedWith3Values() {
    int[] input = {5, 1, 3};
    int target = 1;
    int result = searchInRotatedSortedArray.search(input, target);
    assertThat(result).isEqualTo(1);
  }
}