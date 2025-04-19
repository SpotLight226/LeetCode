class Solution {
    private long countMost(int[] nums, long comp) {
        long result = 0;
        int j = nums.length - 1;
        for(int i = 0; i < j; i++) {
            while(i < j && nums[i] + nums[j] > comp) {
                j--;
            }

            result += j - i;
        }

        return result;
    }


    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return countMost(nums, upper) - countMost(nums, lower - 1);
    }
}