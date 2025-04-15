class Solution {
    public int subsetXORSum(int[] nums) {
        int result = 0;
        
        for(int n : nums) {
            result |= n;
        }

        return result * (1 << (nums.length - 1));
    }
}