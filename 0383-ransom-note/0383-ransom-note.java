class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // magazine 의 문자 개수를 넣을 해쉬맵
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : magazine.toCharArray()) {
            // 해쉬 맵에 c가 없다면 0을 넣고, 있다면 해당 값에 + 1해서 넣기
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // 반복문에서 해쉬맵을 확인하면서 ransomNote 의 글자가 있는지 확인하고, 있다면 개수를 줄여나간다
        for(char c : ransomNote.toCharArray()) {
            // magazine의 글자의 갯수로 만든 해쉬 맵에서 ransomNote의 글자가 없거나, 해당 글자의 개수가 0이라면
            if(!hashMap.containsKey(c) || hashMap.get(c) <= 0) {
                return false;
            }
            // 해쉬 맵을 업데이트
            hashMap.put(c, hashMap.get(c) - 1);
        }

        return true;
    }
}