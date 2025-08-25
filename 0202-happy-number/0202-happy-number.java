class Solution {
    public boolean isHappy(int n) {
        // 투포인터
        // l = 한 번 계산
        // r = 두 번 계산
        int l = getNext(n);
        int r = getNext(getNext(n));

        // 둘이 같다면, 둘 다 1 이거나, 몇 번을 하더라도 1이 될 수 없는 숫자
        while(l != r) {
            // 2번 계산한 값이 1이면 바로 true 리턴
            if(r == 1) {
                return true;
            }

            // l, r 값 계산
            l = getNext(l);
            r = getNext(getNext(r));
        }

        return l == 1;
    }

    private int getNext(int n) {
        int next = 0;

        // n 을 한 자리 씩 떼어서 제곱 후 next 에 더하고, n 의 끝자리를 떼어낸 수로 갱신
        while(n > 0) {
            int digit = n % 10;
            next += digit * digit;
            n = n / 10;
        }

        return next;
    }
}