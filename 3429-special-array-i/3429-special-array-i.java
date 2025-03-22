class Solution {
    public boolean isArraySpecial(int[] nums) {
        // 마지막 앞의 요소까지 반복
        for(int i = 0; i < nums.length - 1; i++) {
            // 현재 요소와 다음 요소가 짝수인지 홀수인지 확인(%2 해서 나머지가 0 or 1)해서 같으면 둘 다 짝수 혹은 홀수
            if(nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }

        return true;
    }
}