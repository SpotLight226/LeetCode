class Solution {
    public int mySqrt(int x) {
        if(x < 2) {
            return x;
        }

        // 2진 검색
        int l = 1;
        int r = x / 2;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            long square = (long) mid * mid; // 제곱은 int의 크기를 넘을 수 있기에 long 으로

            if(square == x) { // 제곱이 x 와 같다면, mid가 제곱근
                return mid;
            } else if (square < x) { // 제곱이 x 보다 작다면, l 을 옮겨서 왼쪽 값 크게
                l = mid + 1;
            } else { // 제곱이 x 보다 크다면, r 을 옮겨서 오른쪽 값 작게
                r = mid - 1;
            }
        }

        return r;
    }
}