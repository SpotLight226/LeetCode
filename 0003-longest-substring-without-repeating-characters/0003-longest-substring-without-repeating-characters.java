class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int result = 0;  
        HashSet<Character> hashSet = new HashSet<>();

        for(int r = 0; r < s.length(); r++) {
            while(hashSet.contains(s.charAt(r))) {
                hashSet.remove(s.charAt(l));
                l++;
            }

            hashSet.add(s.charAt(r));
            result = Math.max(result, r - l + 1);
        }

        return result;
    }
}