class Solution {
    public int romanToInt(String s) {
        int result = 0;
        // hashMap 에 로마숫자와 대응하는 10진수 숫자를 넣는다
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        // 각 문자를 비교
        for(int i = 0; i < s.length() - 1; i++) {
            // V, X, L, C, D, M 은 문자의 앞에 자기보다 작은 문자가 온다면, 그 문자의 값을 뺀다
            // IV => V(5) - I(1) = 4
            // CM => M(1000) - C(100) = 900
            if(hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                result -= hashMap.get(s.charAt(i));
            } else { // 앞의 문자가 뒤의 문자의 값보다 크다면, 더한다
                result += hashMap.get(s.charAt(i));
            }
        }

        return result + hashMap.get(s.charAt(s.length() - 1));
    }
}