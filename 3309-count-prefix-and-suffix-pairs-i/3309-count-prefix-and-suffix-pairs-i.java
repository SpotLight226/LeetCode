class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length;
        int result = 0;

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                String str1 = words[i];
                String str2 = words[j];

                int s1Len = str1.length();
                int s2Len = str2.length();

                if(!(s1Len > s2Len) && str2.substring(0, s1Len).equals(str1)) {
                    if(str2.substring(s2Len - s1Len).equals(str1)) result++;
                }
            }
        }

        return result;
    }
}