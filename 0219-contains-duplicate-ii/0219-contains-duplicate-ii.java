class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            // 현재 숫자
            int n = nums[i];

            // 해쉬 맵에 현재 숫자가 있으며(배열에 해당 숫자와 똑같은 것이 있음)
            // 현재 인덱스 - 해당 숫자의 이전 인덱스 가 k 보다 작다면 
            // true 리턴
            if(hashMap.containsKey(n) && i - hashMap.get(n) <= k) {
                return true;
            }

            // 현재 숫자와 현재 인덱스를 해쉬맵에
            hashMap.put(n, i);
        }

        return false;
    }
}