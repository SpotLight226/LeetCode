class Solution {
    public int longestNiceSubarray(int[] nums) {
        int len = nums.length;
        int max = 1;
        int l = 0;
        int usedBits = 0;

        for(int r = 0; r < len; r++) {
            while((usedBits & nums[r]) != 0) {
                usedBits ^= nums[l];
                l++;
            }

            usedBits |= nums[r];
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}