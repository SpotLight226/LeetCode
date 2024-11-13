class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int l = 0;
        int r = 0;  

        /*
          슬라이딩 윈도우 활용
          r은 nums의 끝까지 가고, l은 0의 개수가 k보다 클 때마다
          다음 제거할 0의 인덱스로 변경된다
          [1,1,1,0,0,0,1,1,1,1,0], k = 2 의 경우, 인덱스 5에서 zeros는 3이된다
          그럼, nums[l] == 0 인 l이 3까지 가서 0의 개수를 -1 하고
          이 다음 확인 시작 위치로 +1 해서 l = 4가 된다
          그럼 r = 6, l = 4, zeros = 2 가 된다
          집을 칠하는 것처럼 0의 개수(zeros)를 k에 맞추고,
          r은 끝까지 가고, l은 시작하는 위치를 설정한다
        */
        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }
            r++;

            if (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
        }

        return r - l;
    }
}