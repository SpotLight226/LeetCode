class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
       }

       int reverse = 0;

        // reverse 가 x의 길이 반 이상을 하지 않게 범위 지정
       while(x > reverse) {
            // 121 = > reverse = 1, x = 12 => reverse = 12, x = 1
            reverse = reverse * 10 + x % 10;
            x /= 10;
       }
        // 1 == 12 (X) || 1 == 12 / 10 (1) (O) -> return true;
       return x == reverse || x == reverse / 10;
    }
}