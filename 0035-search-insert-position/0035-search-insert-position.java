class Solution {
    public int searchInsert(int[] nums, int target) {
        // 2진 검색을 위한 인덱스
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2; // 중간 값
            // 중간 인덱스의 값을 기준으로 l(왼쪽), r(오른쪽) 의 값을 조정한다
            // target을 찾았으면 리턴
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) { // mid인덱스의 값이 target보다 작다면 l을 mid + 1로
                l = mid + 1;
            } else {
                r = mid - 1; // mid인덱스 값이 target보다 크다면 r을 mid - 1로
            }
        }

        return l;
    }
}