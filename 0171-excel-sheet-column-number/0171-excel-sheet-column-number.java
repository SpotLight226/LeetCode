class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for(char c : columnTitle.toCharArray()) {
            // 해당 문자의 값으로 변환 A = 1(65 - 65 + 1) 이므로, 해당 문자에서 'A'(65) 를 뺀 후, + 1 
            int value = c - 'A' + 1;
            // Z가 26이니 문자 한 자리 당, 26 => 자릿 수 올림
            result = result * 26 + value;
        }

        return result;
    }   
}