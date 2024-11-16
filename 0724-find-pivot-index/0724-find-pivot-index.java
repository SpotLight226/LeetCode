class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int lSum = 0;

        // 일단 모든 값을 다 더해서 전체 합을 구한다
        for (int n : nums) {
            totalSum += n;
        }

        for (int i = 0; i < nums.length; i++) {
            // 피벗 인덱스 => 해당 인덱스의 값을 뺀 나머지 값들의 왼쪽, 오른쪽 합들이 같아야 함
            // 즉, 전체 합에서 해당 인덱스의 값을 뺀 것이 왼 쪽의 합 * 2 한 것이 같아야 한다
            if (lSum * 2 == totalSum - nums[i]) { // 왼쪽 합 * 2 가 전체 합 - 해당 인덱스 값 이 똑같은가
                return i; // 같으면 i를 리턴
            }
            lSum += nums[i]; // 위에서 false라면 해당 인덱스의 값을 lSum에 더하기
        }

        return -1; // 위의 for문에서 리턴이 없었다면 -1 리턴
    }
}