package com.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SummaryRangesTest {

  private static final SummaryRanges summaryRange = new SummaryRanges();

  @Test
  public void whenInputIsEmpty() {
    int[] input = new int[]{};
    List<String> list = summaryRange.summaryRanges(input);
    assertThat(list).isEmpty();
  }

  @Test
  public void whenOnlyOneInput() {
    int[] input = new int[]{1};
    List<String> list = summaryRange.summaryRanges(input);
    assertThat(list).hasSize(1).containsExactly("1");
  }

  @Test
  public void whenAllInputsAreIncrementedNumbers() {
    int[] input = new int[]{1, 2, 3, 4, 5};
    List<String> list = summaryRange.summaryRanges(input);
    assertThat(list).hasSize(1).containsExactly("1->5");
  }

  @Test
  public void whenMultipleRangeFound() {
    int[] input = new int[]{0, 1, 2, 4, 5, 7};
    List<String> list = summaryRange.summaryRanges(input);
    assertThat(list).hasSize(3).containsExactly("0->2", "4->5", "7");
  }
}