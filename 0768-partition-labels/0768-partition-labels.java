class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;    
        }

        List<Integer> result = new ArrayList<>();
        int max = 0;
        int prev = -1;

        for(int i = 0; i < s.length(); i++) {
            max = Math.max(max, arr[s.charAt(i) - 'a']);

            if(i == max) {
                result.add(i - prev);
                prev = i;
            }
        }

        return result;
    }
}