class Solution {
    public int maxArea(int[] height) {
        int l = 0; // 왼쪽 포인터
        int r = height.length - 1; // 오른쪽 포인터

        int max = Integer.MIN_VALUE; // 최대 값

        // 포인터를 이동하며 크기 확인
        while (l < r) { 
            int lHeight = height[l]; // 왼쪽 길이
            int rHeight = height[r]; // 오른쪽 길이

            int temp = 0;
            // 왼쪽 길이가 오른쪽 길이보다 작거나 같다면 왼쪽 기준
            if (lHeight <= rHeight) {
                temp = lHeight * (r - l); // 왼쪽 길이 * (오른쪽 포인터 - 왼쪽 포인터) // 가로 길이
                // 최대값 갱신
                if (temp > max) {
                    max = temp;
                }
                l++; // 왼쪽 포인터 옮겨서 다음 크기 확인

            } else { // 오른쪽 길이 기준
                temp = rHeight * (r - l); // 오른쪽 길이 * (오른쪽 포인터 - 왼쪽 포인터)
                if (temp > max) {
                    max = temp;
                }
                r--;

            }
        }

        return max;
    }
}