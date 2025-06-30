class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        // 정렬해서 같아야 anagram
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
        */
        
        // hashMap 에 s 의 단어를 key 로 각 개수를 넣는다
        if(s.length() != t.length()) return false;

        Map<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // hashMap 에 t 의 단어가 key에 없던가, t 의 단어 개수가 0 이라면 false
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if(!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return false;
            }

            // hashMap 을 갱신
            hashMap.put(c, hashMap.get(c) - 1);
        }

        return true;
    }
}