class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // 지운 배열의 인덱스 겸, 개수
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}