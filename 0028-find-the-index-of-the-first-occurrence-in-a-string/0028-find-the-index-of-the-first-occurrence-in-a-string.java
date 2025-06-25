class Solution {
    public int strStr(String haystack, String needle) {
        // needle 의 길이가 더 길면 등장 안함
        if(haystack.length() < needle.length()) {
            return -1;
        }

        // haystack 에서 문자열을 잘라냈을 때, needle 의 길이보다 길어야 하므로, haystack.length() - needle.length()
        // haystack 에서 시작점 i 와 needle 의 길이만큼을 잘랐을 때, needle 과 같다면 시작점 i 리턴
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}