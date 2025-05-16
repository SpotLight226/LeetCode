class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // s에서 공백, 숫자를 제거

        int l = 0;
        int r = s.length() - 1;

        // 양 끝을 비교해가며 다르면 false 리턴
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        // 위의 과정을 거친 후, true 리턴
        return true;
    }
}