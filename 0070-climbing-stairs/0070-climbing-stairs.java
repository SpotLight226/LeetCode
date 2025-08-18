class Solution {
    public int climbStairs(int n) {
      // 계단이 3단까지는 단수가 오르는 방법
      // 1) 1
      // 2) 1 + 1, 2
      // 3) 1+1, 2+1, 1+2 
        if (n <= 3) {
          return n;
        }

      // 계단이 4 이상 이라면, 이전 3단까지 올라가는 방법(3) = prev1
      // 그 전 단계까지 올라가는 방법(2) = prev2
        int prev1 = 3;
        int prev2 = 2;
        int curr = 0;

        // 현재 방법 + 
        for(int i = 3; i < n; i++) {
          curr = prev1 + prev2;
          prev2 = prev1;
          prev1 = curr;
        }

        return curr;
    }
}