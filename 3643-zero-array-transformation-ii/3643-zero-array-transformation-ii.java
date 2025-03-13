class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;

        int sum = 0;
        int queryCount = 0;
        int[] diffArray = new int[n + 1];

        for(int i = 0; i < n; i++) {
            while(sum + diffArray[i] < nums[i]) {
                queryCount++;

                if(queryCount > queries.length) {
                    return -1;
                }

                int l = queries[queryCount - 1][0];
                int r = queries[queryCount - 1][1];
                int value = queries[queryCount - 1][2];

                if(r >= i) {
                    diffArray[Math.max(l, i)] += value;
                    
                    if(r + 1 < diffArray.length) {
                        diffArray[r + 1] -= value;
                    }
                }
            }

            sum += diffArray[i];
        }

        return queryCount;
    }
}