class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        Map<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hashMap.containsKey(c) && hashMap.get(c) >= l) {
                l = hashMap.get(c) + 1;
            }

            max = Math.max(max, i - l + 1);
            hashMap.put(c, i);
        }

        return max;
    }
}