class Solution {
    public boolean wordPattern(String pattern, String s) {
        // s 의 공백을 기준으로 나누어서 배열로 만듦
        String[] arr = s.split(" ");

        // arr 의 개수가 pattern 의 개수가 다르다면, s의 문자 개수가 pattern 의 문자 개수가 다르므로 false
        if(pattern.length() != arr.length) return false;

        HashMap<Character, String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = arr[i];
            
            if(hashMap.containsKey(c)) {
                if(!hashMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                if(hashSet.contains(str)) {
                    return false;
                }

                hashMap.put(c, str);
                hashSet.add(str);
            }
        }

        return true;
    }
}