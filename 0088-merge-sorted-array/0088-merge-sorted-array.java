class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid = m -1; // nums1의 마지막 값 위치
        int left = n - 1; // nums2의 마지막 값 위치
        int right = m + n - 1; // 최종 병합된 배열의 길이

        while(left >= 0) {
            // num1의 값과 num2의 값을 비교
            if(mid >= 0 && nums1[mid] > nums2[left]) { // nums1의 값이 클 때
                nums1[right] = nums1[mid]; // nums1의 끝에 배치
                mid--; // num1의 값을 배치 했으므로, -1
            } else { // num2의 값이 클 때,
                nums1[right] = nums2[left]; // num2의 값을 끝에 배치
                left--; // num2의 값을 배치 했으므로, -1
            }

            right--; // 한 값을 배치 했으므로, 다음 마지막 배치 위치를 -1
        }
    }
}