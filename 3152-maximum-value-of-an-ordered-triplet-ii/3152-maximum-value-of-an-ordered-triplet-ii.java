class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0; // 3개 보다 적게 있으면 삼항 계산 못함

        int max = Integer.MIN_VALUE;
        int diff = 0;
        long result = 0;

        for(int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            if(i >= 2) {
                result = Math.max(result, (long)diff * nums[i]);
            }

            if(i >= 1) {
                diff = Math.max(diff, max - nums[i]);
            }
        }

        return result;
    }
}