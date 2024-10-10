class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*
        // 해쉬맵
        HashMap<Character, Character> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 해쉬 맵에 c 가 있다면, c를 키로 가져온 값이 t의 문자와 다르면 false
            if (hashMap.containsKey(c)) {
                if (hashMap.get(c) != t.charAt(i)) {
                    return false;
                }
            } else { // c가 없다면, t의 문자를 값으로 가져온 키가 있다면 false
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
                hashMap.put(c, t.charAt(i)); // 해쉬 맵에 c를 키로 t의 문자를 value로 넣는다
            }
        }
        return true;
        */

        // 문장의 문자를 인덱스로하여 배열에 구분할 수 있는 값을 넣고 비교
        // 문자를 인덱스로 사용할 배열
        int[] sArr = new int[127];
        int[] tArr = new int[127];

        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i); // s의 문자
            char tC = t.charAt(i); // t의 문자
            // 초기 배열은 모든 값이 0이므로 처음 나타난 문자 인덱스의 값은 0
            // s의 문자와 t의 문자를 인덱스로한 배열의 값이 다르면 문자가 다른 위치에서 나타난 것이므로 false
            if (sArr[sC] != tArr[tC]) {
                return false;
            }
            // 각 문장의 문자를 인덱스로 위치를 구분하기 위한 i + 1을 넣는다
            sArr[sC] = i + 1;
            tArr[tC] = i + 1;

        }
        return true;
    }
}