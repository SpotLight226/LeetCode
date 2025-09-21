class Solution {
    public boolean canJump(int[] nums) {
        // 가야할 길이
        int last = nums.length - 1; 

        for(int i = nums.length - 2; i >= 0; i--) {
            // 현재 위치 + 최대 점프 길이 >= 가야할 길이
            if(i + nums[i] >= last) {
                last = i;
            }
        }

        return last == 0;
    }
}