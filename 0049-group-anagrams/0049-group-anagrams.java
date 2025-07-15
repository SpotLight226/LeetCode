class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String str : strs) {
            //ASCII 값 (문자 - 'a') => 문자의 int값 - 97
            int[] arr = new int[26];

            for(char c : str.toCharArray()) {
                arr[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int n : arr) {
                sb.append(n).append("#");
            }

            String key = sb.toString();
            if(!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(str);
        }

        return new ArrayList<>(result.values());
    }
}