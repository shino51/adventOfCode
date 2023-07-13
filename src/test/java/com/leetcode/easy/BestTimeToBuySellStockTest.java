package com.leetcode.easy;

import com.leetcode.easy.BestTimeToBuySellStock;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BestTimeToBuySellStockTest {

  private final BestTimeToBuySellStock classUnderTest = new BestTimeToBuySellStock();

  @Test
  public void test1() {
    int[] prices = new int[]{7,1,5,3,6,4};
    assertThat(classUnderTest.maxProfit(prices)).isEqualTo(5);
  }

  @Test
  public void testNoProfit() {
    int[] prices = new int[]{7,6,4,3,1};
    assertThat(classUnderTest.maxProfit(prices)).isZero();
  }
}