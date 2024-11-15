class Solution {
    public int longestSubarray(int[] nums) {
        int answer = 0;
        int zeros = 0;
        int l = 0;
        
        // 슬라이딩 윈도우
        for (int i = 0; i < nums.length; i++) {
            // 0이라면 zeros(0의 개수) 를 +1
            if (nums[i] == 0) {
                zeros++;
            }

            // zeros(0의 개수)가 2라면 지울 수 있는  0은 1개 뿐이므로
            while (zeros == 2) {
                // nums[l] 이 0이라면 zeros 를 -1한다
                if (nums[l] == 0) {
                    zeros--;
                }
                l++; // nums[l]이 0이 아니라면 l을 +1하면서 0을 찾는다
            }

            answer = Math.max(answer, i - l);
        }

        return answer;
    }
}