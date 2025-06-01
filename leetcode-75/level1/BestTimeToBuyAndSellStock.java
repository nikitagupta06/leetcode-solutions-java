// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) { 
        
        int low = prices[0], profit = 0, maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (low < prices[i]) {
                profit = prices[i] - low;
            } else {
                low = prices[i];
            }
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}