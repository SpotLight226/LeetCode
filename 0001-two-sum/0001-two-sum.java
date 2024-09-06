class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 브루트 포스 방식 
        /*
        int[] arr = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;   
                    break;           
                }
            }
        }        
        return arr;
        */
        // 해쉬 방식 => 더 빠름 (이 방식을 기억하자)
        Map<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;

        // 해쉬에 배열의 요소와 인덱스를 넣는다
        for (int i = 0; i < n; i++) {
            hashMap.put(nums[i], i);
        }
        // 합의 짝을 찾기위해 target 에서 nums 의 요소를 뺀 값을 해쉬 맵에서 찾는다
        for (int i = 0; i < n; i++) {
            int temp = target - nums[i];
            // 해쉬에 temp 가 있고, 해쉬의 value 가 i 가 아닌 것(똑같은 인덱스 안됨)
            if (hashMap.containsKey(temp) && hashMap.get(temp) != i) {
                return new int[]{i, hashMap.get(temp)};
            }
        }

        return new int[]{};
    }
}