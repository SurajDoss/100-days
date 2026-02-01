class Solution {
    public int maxProfit(int[] prices) {
        int maxProfits = 0;
        int length = prices.length;
        for(int i = 0; i < length-1; i++){
            if( prices[i] < prices[i+1] ){
                maxProfits += prices[i+1] - prices[i];
            }
        }

        return maxProfits;
    }
}
