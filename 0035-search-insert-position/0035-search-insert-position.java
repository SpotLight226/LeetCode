class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            // 중간 인덱스
            int mid = l + (r - l) / 2;

            // 찾았으면 mid 인덱스 리턴
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) { // target 이 mid 인덱스 값보다 크다면, 
                r = mid - 1; // 오른쪽 인덱스를 mid 인덱스 앞으로
            } else { // 작다면
                l = mid + 1; // 왼쪽 인덱스를 mid 인덱스 뒤로
            }
        }

        // 모든 반복을 진행 후에 target을 못 찾았다면, 넣을 곳인 왼쪽 인덱스를 리턴
        return l;
    }
}