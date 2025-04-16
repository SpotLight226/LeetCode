class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long result = 0;
        int l = 0;

        for(int i = 0; i < nums.length; i++) {
            k -= map.getOrDefault(nums[i], 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while(k <= 0) {
                map.put(nums[l], map.get(nums[l]) - 1);
                k += map.get(nums[l++]);
            }

            result += l;
        }

        return result;
    }
}