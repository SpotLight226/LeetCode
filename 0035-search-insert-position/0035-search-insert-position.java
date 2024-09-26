class Solution {
    public int searchInsert(int[] nums, int target) {
        // 2진 검색을 위한 인덱스
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }
}