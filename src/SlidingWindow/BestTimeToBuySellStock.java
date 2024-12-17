package SlidingWindow;

public class BestTimeToBuySellStock {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            //Brute force solution
            for(int i=0; i<prices.length; i++){
                for(int j=i+1; j<prices.length; j++){
                    int profit = prices[j]-prices[i];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
            return maxProfit;
        }

}

