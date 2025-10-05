class Solution {
    public boolean isPalindrome(int x) {
        // 음수는 Palindrome이 될 수 없음
        if(x < 0) {
            return false;
        }

        // 역수와 x 를 비교하기 위해서 x 의 값을 저장
        int reverse = 0;
        int xCopy = x;

        while(x > 0) {
            // 역수의 1의 자리를 10의 자리로 올리고, x 의 끝자리 수를 더한다
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        return reverse == xCopy;
    }
}