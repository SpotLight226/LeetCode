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

        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);

            if(!Character.isLetterOrDigit(left)) {
                l++;
            } else if (!Character.isLetterOrDigit(right)) {
                r--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                l++;
                r--;
            }
        }

        return true;
    }
}