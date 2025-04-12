class Solution {
    public int maxScore(String s) {
        int totalOne = 0;
        int zeros = 0;
        int ones = 0;
        int result = Integer.MIN_VALUE;

        for(char c : s.toCharArray()) {
            if(c == '1') totalOne++;
        }

        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }

            int current = zeros + (totalOne - ones);
            result = Math.max(result, current);
        }

        return result;
    }
}