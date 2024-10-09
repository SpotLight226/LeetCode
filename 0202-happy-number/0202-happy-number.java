class Solution {
    public boolean isHappy(int n) {
        // 다음 숫자를 계산했을 때, 똑같은 숫자는 계산해봤자 똑같은 과정이 반복되므로 set으로 동일한지 확인
        Set<Integer> set = new HashSet<>(); 

        // set에 해당 숫자(n)이 없을 때만
        while (!set.contains(n)) {
            set.add(n); 
            n = getNext(n); // 다음 숫자로
            if(n == 1) return true; // 1이면 true
        }
        return false; // 없으면 false
    }
    // 다음 숫자 찾기 => 각 마지막 위치의 숫자를 하나씩 떼어 계산
    public int getNext(int n) {
        int next = 0;

        while (n > 0) {
            int digit = n % 10;
            next += digit * digit;
            n /= 10;
        }

        return next;
    }
}