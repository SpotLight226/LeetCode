class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (hashMap.containsKey(c)) {
                if (hashMap.get(c) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
                hashMap.put(c, t.charAt(i));
            }
        }
        return true;
    }
}