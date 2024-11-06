class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length]; // 리턴 배열

        // 리턴 배열을 1로 초기화 => 배열 생성시 다 0 이므로 곱할 수 잇게 1로
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
        }
        // 왼쪽, 오른쪽 시작 인덱스
        int l = 1;
        int r = 1;

        /* 리턴 배열에서 각 인덱스 위치마다 곱해야할 nums의 인덱스
            [24, 12, 8, 16]
             1   0   0   0  
             2   2   1   1
             3   3   3   2 
        */
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= l;
            l *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= r;
            r *= nums[i];
        }

        return answer;
    }
}