class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int n : nums) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        for(int n : hashMap.values()) {
            if(n % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}