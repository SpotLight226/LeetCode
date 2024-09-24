class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0; // nums 의 길이가 0이라면 0 리턴

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}