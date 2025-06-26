class Solution {
    public boolean isPalindrome(String s) {
        /*
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
        */

        // 양 끝의 인덱스
        int l = 0; 
        int r = s.length() - 1;

        while(l < r) {
            char left = s.charAt(l); // 왼쪽
            char right = s.charAt(r); // 오른쪽

            // 왼쪽, 오른쪽 글자가 공백 또는 숫자가 아닌지 확인
            if(!Character.isLetterOrDigit(left)) {
                l++;
            } else if (!Character.isLetterOrDigit(right)) {
                r--;
            } else { // 둘 다 공백 또는 숫자가 아니면 왼쪽, 오른쪽 글자를 비교, 대문자일 수 있으니 소문자로 변환해서
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                // 다음 글자로
                l++;
                r--;
            }
        }

        return true;
    }
}