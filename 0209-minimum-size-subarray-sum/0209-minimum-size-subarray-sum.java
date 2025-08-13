class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE; // 최소 개수
        int l = 0;
        int sum = 0;

        for(int r = 0; r < nums.length; r++) {
            sum += nums[r]; // 합계에 배열의 현재 값(r 인덱스 값)을 더함
            
            while(sum >= target) {
                if(r - l + 1 < min) {
                    min = r - l + 1;
                }

                sum -= nums[l];
                l++;
            }
        }

        return min != Integer.MAX_VALUE ? min : 0;
    }
}