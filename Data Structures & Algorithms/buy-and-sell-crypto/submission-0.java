class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int intial =prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<intial)intial = prices[i]; 
            if(prices[i]-intial>profit)profit = prices[i]-intial;           
        }
        return profit;
    }
}
