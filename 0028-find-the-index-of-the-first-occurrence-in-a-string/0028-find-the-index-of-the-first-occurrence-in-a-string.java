class Solution {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        // needle 의 길이가 더 길면, haystack 안 에 있을 수가 없음
        if(hLength < nLength) return -1;


        // haystack 에 needle 이 포함되려면 (haystack 의 길이 - needle 의 길이) 의 인덱스 안에서 needle 이 시작되어야 함
        // ex) sadbutsad(9), sad(3) => 9 - 3 => 6 인덱스 안에 needle 이 시작되어야 함
        for(int i = 0; i <= hLength - nLength; i++) {
            // haystack 을 시작점 i 에서 needle 의 길이 만큼을 잘랐을 때, needle 과 같다면 시작점 i 리턴
            if(haystack.substring(i, i + nLength).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}