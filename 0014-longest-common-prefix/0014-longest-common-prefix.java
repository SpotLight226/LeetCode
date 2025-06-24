class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0]; // 초기 접두사
        int preLen = prefix.length(); // 접두사 길이

        for(int i = 1; i < strs.length; i++) {
            String str = strs[i]; // 다음 단어

            // 다음 단어의 길이가 접두사의 길이보다 작거나, 접두사가 다음 단어를 접두사 길이 만큼 잘랐을 때, 똑같지 않다면
            while(preLen > str.length() || !prefix.equals(str.substring(0, preLen))) {
                preLen--; // 접두사의 길이를 -1

                // 접두사의 길이가 0이라면, 동일한 접두사가 없다는 뜻이므로 "" 리턴
                if(preLen == 0) {
                    return "";
                }

                // 접두사 갱신
                prefix = prefix.substring(0, preLen);
            }
        }

        return prefix;

    }
}