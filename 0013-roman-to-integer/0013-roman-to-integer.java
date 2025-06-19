class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        for(int i = 0; i < s.length() - 1; i++) {
            if(hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                result -= hashMap.get(s.charAt(i));
            } else {
                result += hashMap.get(s.charAt(i));
            }
        }

        return result + hashMap.get(s.charAt(s.length() - 1));
    }
}