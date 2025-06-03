class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if(hashMap.containsKey(n) && i - hashMap.get(n) <= k) {
                return true;
            }

            hashMap.put(n, i);
        }

        return false;
    }
}