class Solution {
    public int maxArea(int[] height) {
        int max = 0; // 최대 
        // 포인터
        int l = 0;  // 시작
        int r = height.length - 1; // 끝

        while (l < r) {
            // 최대 = 기존 최대 (비교) l 과 r 에서 더 큰 것을 기준 * 길이(r - l)
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));

            // 시작 점이 끝 점보다 작다면,
            if (height[l] < height[r]) {
                l++; // 시작 점을 한칸 뒤로
            } else { // 더 크면
                r--; // 끝 점을 한칸 앞으로
            }
        }
        return max; // 최대 값을 리턴
    }
}