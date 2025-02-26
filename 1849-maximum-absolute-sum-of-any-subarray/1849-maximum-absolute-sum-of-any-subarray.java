class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int min = 0;
        int max = 0;

        for(int n : nums) {
            sum += n;

            if(sum > max) {
                max = sum;
            }

            if(sum < min) {
                min = sum;
            }
        }

        return Math.abs(max - min); // 가능한 모든 부분 배열 합 중 가장 큰 절대값
    }
}