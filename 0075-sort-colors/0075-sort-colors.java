class Solution {
    public void sortColors(int[] nums) {
        // 왼쪽, 중간, 오른쪽
        int l = 0;
        int m = 0;
        int r = nums.length - 1;

        while(m <= r) {
            if(nums[m] == 0) { // 중간 값이 0일 때 => 왼쪽으로 밀어야 함
                int temp = nums[l]; // 왼쪽의 값을 임시로 저장
                nums[l] = nums[m]; // 0을 가장 왼쪽으로
                nums[m] = temp; // 중간 값을 왼쪽의 값으로 변경
                // 왼쪽, 중간 인덱스 +1
                l++;
                m++;
            } else if (nums[m] == 1) { // 중간 값이 1이면 그대로
                m++; // 중간 인덱스 +1
            } else { // 중간 값이 2일 때 => 오른쪽으로 밀어야 함
                int temp = nums[m]; // 중간값을 임시 저장
                nums[m] = nums[r]; // 오른쪽 값을 중간으로 이동
                nums[r] = temp; // 2를 오른쪽으로 밀기
                r--; // 2를 오른쪽으로 밀었으므로, 오른쪽 인덱스 -1
            }
        }
    }
}