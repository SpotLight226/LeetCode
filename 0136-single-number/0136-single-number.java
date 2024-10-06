class Solution {
    public int singleNumber(int[] nums) {
        /*
        // 해쉬맵 이용한 방법
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
        */

        // 비트연산(2진수)
        // xor => 동일한 두 값을 연산하면 0을 리턴
        //        0과 어떤 값을 연산하면 그 값을 리턴 
        // 즉, [4,1,2,1,2] 일 때, 
        // 0 = 0^4 -> xor = 4
        // 4^1 -> (0100)^(0001) -> 5(0101)
        // 5^2 -> (0101)^(0010) -> 7(0111)
        // 7^1 -> (0111)^(0001) -> 6(0110)
        // 6^2 -> (0110)^(0010) -> 4(0100)
        int xor = 0;

        for (int n : nums) {
            xor = xor ^ n;
        }

        return xor;
    }
}