class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i]; // 배열의 요소

            // 해쉬 맵에 배열의 요소가 있으며(배열 안에 이 요소가 있음)
            // 현재의 인덱스 - 이전 요소의 인덱스 <= k (k보다 크거나 같을 때)
            if(hashMap.containsKey(n) && i - hashMap.get(n) <= k) {
                return true;
            }

            hashMap.put(n, i); // 해쉬 맵에 배열의 요소와 인덱스를 넣는다
        }

        return false;
    }
}