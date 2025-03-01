class Solution {
    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int idx = 0;
        int i = 0;

        for(i = 0; i < nums.length - 1; i++) {
            if(nums[i] != 0) {
                if(nums[i] == nums[i + 1]) {
                    result[idx] = nums[i] * 2;
                    i++;
                } else {
                    result[idx] = nums[i];
                }
                idx++;
            }
        }

        if(i != nums.length) {
            result[idx] = nums[nums.length - 1];
        }

        return result;
    }
}