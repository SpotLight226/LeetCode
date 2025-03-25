class Solution {
    public int maxAscendingSum(int[] nums) {
        int result = nums[0];
        int sum = nums[0];

        // 요소가 1개라면 그 값을 리턴
        if(nums.length == 1) {
            return result;
        }

        for(int i = 1; i < nums.length; i++) {
            // 다음 요소가 더 크면
            if(nums[i] > nums[i - 1]) {
                sum += nums[i]; // 합에 더하기
            } else { // 작으면
                sum = nums[i]; // 합계값을 초기화
            }

            // 결과 값을 현재 값과 요소를 더한 값을 비교
            result = Math.max(result, sum);
        }

        return result;
    }
}