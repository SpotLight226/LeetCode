class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;

        // 단순하게 다음 날 주식 가격이 더 높다면 판다
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
            }
        }

        return result;
    }
}