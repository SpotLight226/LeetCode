class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid = m - 1;
        int left = n - 1;
        int right = m + n - 1;

        while(left >= 0) {
            if(mid >= 0 && nums1[mid] > nums2[left]) {
                nums1[right] = nums1[mid];
                mid--;
            } else {
                nums1[right] = nums2[left];
                left--;
            }

            right--;
        }
    }
}