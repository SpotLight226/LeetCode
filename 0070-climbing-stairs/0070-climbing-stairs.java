class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 0) return 1;
        // 재귀 함수로 1개 올라가는 방식과 2개 올라가는 방식을 호출하여 더하는 방법은 시간 초과
        // return climbStairs(n -1) + climbStairs(n - 2);

        // dp 배열
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1; // 처음 과 다음은 1로 고정
        
        // i-1, i-2 의 값을 호출하여 마지막 개수를 구한다
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}