class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int n = nums.length;

        // 감소되지 않는 순서로 정렬된 배열을 반복
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) { // 0 이면 넘어감
                continue;
            } // 음수가 없고(앞의 요소들은 다 0), 현재 요소가 양수라면 뒤부터는 다 양수이므로 n - i 리턴
            else if (negative == 0 && nums[i] > 0) { 
                return n - i;
            } else if (nums[i] < 0) { // 음수 면 음수 개수 + 1
                negative++;
            } else if (nums[i] > 0) { // 양수 면 뒤에 요소들은 다 양수이므로, 앞의 음수 개수와 남은 요소 개수 비교해서 리턴
                return Math.max(negative, n - i);
            }
        }

        return Math.max(negative, 0); // 음수가 있다면 음수 개수 리턴, 없으면 0
    }
}