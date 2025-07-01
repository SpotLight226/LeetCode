class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return nums;
        */

        // nums[i] 를 key 로 i 를 value 로 
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            // n + () = target -> () = target - n
            // hashMap 에 target - n 이 있다면, 두 개의 key 를 더하면 target 이 나옴
            // value 는 i 즉, idx 라서 i 와, hashMap 의 value 를 배열로 만들어 리턴
            if(hashMap.containsKey(target - n)) {
                return new int[] {i, hashMap.get(target - n)};
            }

            hashMap.put(n, i);
        }

        return new int[]{};
    }
}