class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0; // s 의 문자 위치
        int tIdx = 0; // t 의 문자 위치

        // sIdx, tIdx 가 범위를 벗어나지 않을 때 까지
        while(sIdx < s.length() && tIdx < t.length()) {
            // s 와 t 의 문자가 같다면 s 의 문자 위치 이동
            if(s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }

            // 아니면 t 의 문자 위치를 이동해서 다음 문자 비교
            tIdx++;
        }

        // 반복문을 다 진행하고, sIdx 가 s의 길이와 같다면 t에 모든 문자가 있다는 뜻
        return sIdx == s.length();
    }
}