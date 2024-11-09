class Solution {
    public int maxArea(int[] height) {
        /*
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
        */

        // 위 코드를 간단하게 Math 메서드 사용
        int l = 0;
        int r = height.length - 1;

        int max = Integer.MIN_VALUE;

        while (l < r) {
            // Math메서드로 max 더 큰 값을 선택
            // max 와 min메서드를 사용하여 왼쪽, 오른쪽 길이 중 작은 것 * (오른쪽 포인터 - 왼쪽 포인터)
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));

            // 왼쪽 길이가 오른쪽 보다 작으면 l++
            if (height[l] < height[r]) {
                l++;
            } else { // 아니면 r--
                r--;
            }
        }

        return max;
    }
}