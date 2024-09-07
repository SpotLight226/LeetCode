class Solution {
    public boolean isPalindrome(int x) {
        // 음수 일때는 아님
        if (x < 0) {
            return false;
        }

        int temp = x; // 계산 위해서 임시 값
        int reverse = 0; // 뒤집은 값
        
        while (temp > 0) {
            int digit = temp % 10; // 뒷 자리르 떼어내기
            reverse = reverse * 10 + digit; // 뒤집은 값에서 이전 값의 위치를 하나 올리고 떼어낸 뒷 자리를 더한다
            temp /= 10; // 임시 값을 업데이트
        }

        return reverse == x; // 뒤집은 값과 같은 지 확인해서 true or false 리턴
    }
}