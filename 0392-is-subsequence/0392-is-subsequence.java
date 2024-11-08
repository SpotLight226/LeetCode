class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0; // s의 포인터
        int tp = 0; // t의 포인터

        // 포인터의 범위를 벗어나지 않을 때 까지
        while (sp < s.length() && tp < t.length()) {
            // s에서 sp위치에 있는 문자와 t에서 tp위치에 있는 문자가 같으면 sp를 +1
            if (s.charAt(sp) == t.charAt(tp)) { 
                sp++;
            }
            tp++; // tp는 계속 1 씩 증가하며 동일한 문자 찾기
        }
        // sp가 s의 길이와 같다는 것은 t에서 문자를 삭제해 s를 만들 수 있다는 것
        return sp == s.length(); 
    }
}