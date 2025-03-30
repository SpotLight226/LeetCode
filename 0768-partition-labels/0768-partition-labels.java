class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;   // 해당 문자의 마지막 인덱스(위치)
        }

        List<Integer> result = new ArrayList<>();
        int max = 0; // 가장 긴 문자 길이
        int prev = -1; // 이전 문자 길이

        for(int i = 0; i < s.length(); i++) {
            // 문자의 마지막 인덱스와 해당 문자에서 잘랐을 시, 문장의 길이
            max = Math.max(max, arr[s.charAt(i) - 'a']);
            
            if(i == max) {
                result.add(i - prev);
                prev = i;
            }
        }

        return result;
    }
}