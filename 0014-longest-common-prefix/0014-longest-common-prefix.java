class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return null;
        }

        String str = strs[0]; // 첫 번째 문자열이 기준

        for (int i = 1; i < strs.length; i++) {
            // indexOf(str) 로 기준 문자열의 시작 지점이 0인지를 확인 하여 접두사인지 확인
            while (strs[i].indexOf(str) != 0) { // 0이 아니라면 접두사가 아님
                str = str.substring(0, str.length() - 1); // 기준 문자열에서 뒤의 한글자 제거
                if (str.isEmpty()) { // 기준 문자열이 공백이되면 접두사가 없음
                    return "";
                }
            }
        }

        return str;
    }
}