class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return; // 길이가 1이면 종료

        int l = 0; // 왼쪽 포인터

        // i가 오른쪽 포인터
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // 오른쪽 포인터의 값이 0이 아니라면
                int temp = nums[i]; // 임시 값
                nums[i] = nums[l]; // 오른쪽 포인터의 값을 num[l] 로
                nums[l] = temp;
                l++;
            }
        }
    }
}