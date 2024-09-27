class Solution {
    public int mySqrt(int x) {
       // 이진 탐색을 위한 시작점
        int l = 1;
        int r = x;

        while (l <= r) {
            // 이게 가장 헷갈렸는데 int 형은 소수점이 생길 시 반올림된다
            int mid = l + (r - l) / 2; // 중간값
            // 중간 값이 x / mid 보다 작다면 ((mid * mid) < x)
            if (mid < x / mid) {
                l = mid + 1; // 왼쪽 값을 중간값의 +1
            } else if (mid > x / mid) { // 중간 값이 x / mid 보다 크다면 ((mid * mid) > x)
                r = mid - 1; // 오른쪽 값을 중간 값의 -1
            } else {
                return mid;
            }
        }
        return r; // 위의 반복문을 거쳐 r이 제곱근으로 리턴 
    }
}