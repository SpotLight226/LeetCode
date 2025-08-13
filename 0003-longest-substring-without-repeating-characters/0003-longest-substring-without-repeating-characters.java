class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0; //최대 길이
        int l = 0; // 왼쪽 인덱스
        Map<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 단어

            // 해쉬 맵에 단어(c)가 있고, 해당 단어의 위치가 1보다 크다면
            if(hashMap.containsKey(c) && hashMap.get(c) >= l) {
                l = hashMap.get(c) + 1; // 왼쪽을 갱신
            }

            // 현재 길이 = 오른쪽 인덱스(i) - 왼쪽 인덱스(l) + 1
            // Math.max 로 이전 최대 길이와 현재 길이를 비교
            max = Math.max(max, i - l + 1);
            // 해쉬 맵에 현재 단어(c)의 위치(인덱스)를 갱신
            hashMap.put(c, i);
        }

        return max; // 최대 길이 리턴
    }
}