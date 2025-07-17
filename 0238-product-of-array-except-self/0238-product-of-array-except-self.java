class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            result[i] = 1;
        }

        int l = 1;
        for(int i = 0; i < len; i++) {
            result[i] *= l;
            l *= nums[i];
        }

        int r = 1;
        for(int i = len - 1; i >= 0; i--) {
            result[i] *= r;
            r *= nums[i];
        }

        return result;
    }
}