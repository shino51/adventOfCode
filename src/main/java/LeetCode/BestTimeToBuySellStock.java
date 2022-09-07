package LeetCode;

public class BestTimeToBuySellStock {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int lowestPriceForPurchase = Integer.MAX_VALUE;
    for (int price: prices) {
      lowestPriceForPurchase = Math.min(lowestPriceForPurchase, price);
      maxProfit = Math.max(maxProfit, price - lowestPriceForPurchase);

    }
    return maxProfit;
  }
}
