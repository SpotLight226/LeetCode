class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // magazine 의 단어를 해쉬 맵에 단어를 key, 개수를 value 로 넣는다
        for(char c : magazine.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            // 해쉬 맵에 ransomeNote 의 단어가 없거나, 해당 단어의 개수가 이미 사용되어 0 or -1 이라면 false 리턴
            if(!hashMap.containsKey(c) || hashMap.get(c) <= 0) {
                return false;
            }

            // ransomNote 의 단어로 사용 
            hashMap.put(c, hashMap.get(c) - 1);
        }

        return true;
    }
}