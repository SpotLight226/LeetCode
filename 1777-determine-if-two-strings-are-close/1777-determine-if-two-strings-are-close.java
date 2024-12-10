class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        int[] w1Arr = new int[26];
        int[] w2Arr = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            w1Arr[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); i++) {
            w2Arr[word2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(w1Arr, w2Arr)) {
            return true;
        }

        for (int i = 0; i < 26; i++) {
            if ((w1Arr[i] == 0 && w2Arr[i] != 0) || (w1Arr[i] != 0 && w2Arr[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(w1Arr);
        Arrays.sort(w2Arr);

        if (Arrays.equals(w1Arr, w2Arr)) {
            return true;
        }

        return false;
    }
}