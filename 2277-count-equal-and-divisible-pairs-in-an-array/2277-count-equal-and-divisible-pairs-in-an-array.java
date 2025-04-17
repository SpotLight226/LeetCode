class Solution {
    public int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j : map.getOrDefault(nums[i], new ArrayList<>())) {
                if((i * j) % k == 0) {
                    result++;
                }
            }
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        return result;
    }
}