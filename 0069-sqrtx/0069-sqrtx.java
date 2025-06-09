class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;

        // 2진 검색
        int l = 1;
        int r = x;

        while(l <= r) {
            // 중간 값
            int m = (r - l) / 2 + l;

            // 중간 값이 x를 m으로 나눈 몫보다 크다면 오른쪽을 변경 
            if(m > x / m) {
                r = m - 1;
            } else if (m < x / m) { // 작다면 왼쪽 변경
                l = m + 1;
            } else {
                return m;
            }
        }

        return r;
    }
}