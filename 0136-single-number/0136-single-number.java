class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // hashMap에 nums의 요소를 key로 해서 만약 key가 있다면 가져온 값에 + 1, 없다면 1
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        // 반복문을 통해 hashMap의 값이 1인 n을 리턴
        for (int n : hashMap.keySet()) {
            if(hashMap.get(n) == 1) return n;
        }

        // return이 없으면 -1
        return -1;
    }
}