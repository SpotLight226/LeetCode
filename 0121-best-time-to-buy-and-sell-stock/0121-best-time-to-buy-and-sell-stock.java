class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0]; // 기본 구매가격은 일단 첫 요소
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            // 다른 가격이 구매 가격보다 작다면 산 가격을 변경
            if(prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) { // 판매 가격 - 구매 가격을 계산해서, 이익이 큰지 확인
                profit = prices[i] - buy;
            }
        }

        return profit;
    }
}