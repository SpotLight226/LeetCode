class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = getNum(n); // 다음 숫자
            if(n == 1) return true;
        }

        return false;   
    }

    private int getNum(int n) {
        int result = 0;
        
        // 자리를 하나씩 떼어서 제곱하여 더하기
        while(n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n = n / 10;
        }

        return result;
    }
}