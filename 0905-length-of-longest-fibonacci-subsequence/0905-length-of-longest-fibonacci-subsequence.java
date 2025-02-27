class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int result = 0;

        for(int i = 2; i < n; i++) {
            int l = 0;
            int r = i - 1;

            while(l < r) {
                int sum = arr[l] + arr[r];
                if(sum > arr[i]) {
                    r--;
                } else if (sum < arr[i]) {
                    l++;
                } else {
                    dp[r][i] = dp[l][r] + 1;
                    result = Math.max(dp[r][i], result);
                    r--;
                    l++;
                }
            }
        }

        if(result == 0) {
            return 0;
        } else {
            return result + 2;
        }
    }
}