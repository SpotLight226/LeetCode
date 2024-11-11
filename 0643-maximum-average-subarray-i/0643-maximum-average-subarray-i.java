class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
       
        // 일단 0 부터 k까지의 합을 구함
        for(int i = 0; i < k; i ++) {
            sum += nums[i];
        }

        int max = sum; // 최대 값을 설정

      
        // (i - k) -> 0부터 시작) 을 빼고 nums[k]를 더해 합을 조정하며, 최대 값과 현재 합 값을 비교해 최대 값을 설정
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return (double)max / k; // 평균을 리턴하기 위해서 max / k 
    }
}