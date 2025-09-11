class Solution {
    public int maxProfit(int[] prices) {
        // 처음 구매 가격은 첫번째 값으로
        int buy = prices[0]; 
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            // 구매 가격이 다른 값보다 크다면, 구매 가격 교체
            if(buy > prices[i]) {
                buy = prices[i];
            }
            // 이득 => 기존 이득과 다음 이득을 비교해서 교체
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }
}