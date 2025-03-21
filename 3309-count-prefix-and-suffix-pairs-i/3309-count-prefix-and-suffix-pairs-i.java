class Solution {

    private boolean check(String str1, String str2) {
        int s1Len = str1.length();
        int s2Len = str2.length();

        // s1의 길이가 s2보다 길다면 접두사가 성립 X
        if(s1Len > s2Len) return false;
        
        // s2에서 s1의 길이까지 잘라서 같은지(접두사) && s2에서 s2 - s1 길이부터 끝까지 잘라서 같은지(접미사)
        return str2.substring(0, s1Len).equals(str1) && str2.substring(s2Len - s1Len).equals(str1);
    }

    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length;
        int result = 0;

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                String str1 = words[i];
                String str2 = words[j];

                

                if(check(str1, str2)) {
                    result++;
                }
            }
        }

        return result;
    }
}