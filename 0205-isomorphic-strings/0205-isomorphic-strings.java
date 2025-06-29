class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++) {
            char sc = s.charAt(i); // s의 문자
            char tc = t.charAt(i); // t의 문자

            // sc 를 key 로, tc 를 value 로 사용해서 sc 와 tc 를 1대1 대응시킨다
            if(hashMap.containsKey(sc)) {
                if(hashMap.get(sc) != tc) {
                    return false;
                }
            } else if (hashMap.containsValue(tc)) {
                return false;
            }

            hashMap.put(sc, tc);
        }

        return true;
    }
}