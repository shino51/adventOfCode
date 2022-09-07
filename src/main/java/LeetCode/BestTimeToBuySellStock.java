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
//    for(int purchaseDay = 0; purchaseDay < maxDays - 1; purchaseDay++) {
//      int priceForPurchase = prices[purchaseDay];
//      if (lowestPriceForPurchase < priceForPurchase) {
//        continue;
//      }
//      lowestPriceForPurchase = priceForPurchase;
//      int highestPriceForSell = priceForPurchase;
//      for(int sellDay = purchaseDay + 1; sellDay <maxDays; sellDay++) {
//        int priceForSell = prices[sellDay];
//        if (priceForSell <= highestPriceForSell) {
//          // go to next iteration
//          continue;
//        }
//        highestPriceForSell = priceForSell;
//        int profit = priceForSell - priceForPurchase;
//        maxProfit = Math.max(maxProfit, profit);
//      }
//    }
//    return maxProfit;
  }
}
