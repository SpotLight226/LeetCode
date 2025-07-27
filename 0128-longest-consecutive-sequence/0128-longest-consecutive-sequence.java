class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int n : nums) {
            hashSet.add(n);
        }

        int result = 0;

        for(int n : hashSet) {
            if(!hashSet.contains(n - 1)) {
                int length = 1;

                while(hashSet.contains(n + length)) {
                    length++;
                }

                result = Math.max(result, length);
            }
        }

        return result;
    }
}