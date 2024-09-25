class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        int max = 0;
        for(int i=1; i<n; i++){
            if(buy < prices[i]){
                profit = prices[i] - buy;
                max = Math.max(profit,max);
            }
            else{
                buy = prices[i];
            }
        }
        return max;
    }
}