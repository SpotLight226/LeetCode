class Solution {
    public int maxOperations(int[] nums, int k) {
        /*
        Arrays.sort(nums); // 작은 수 + 큰 수 하기 위해서 정렬

        int l = 0;
        int r = nums.length - 1;
        int count = 0;

        while (l < r) {
            // 합 값
            int temp = nums[l] + nums[r];

            // 합 과 k가 같다면 count + 1, 왼쪽, 오른 쪽 포인터 이동
            if (temp == k) {
                l++;
                r--;
                count++;
            } else if (temp < k) { // 합이 k 보다 작다면 왼쪽 포인터를 이동하여 작은 수를 더 큰 값으로 교체
                l++;
            } else { // 합이 k 보다 크면 오른 쪽 포인터를 이동하여 큰 수를 더 작은 값으로 교체
                r--;
            }
        }

        return count;
        */

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= k) {
                nums[i] = 0;
            }
        }
        
        Arrays.sort(nums); // 작은 수 + 큰 수 하기 위해서 정렬

        int l = 0;
        int r = nums.length - 1;
        int count = 0;

        while (l < r) {
            // 합 값
            int temp = nums[l] + nums[r];

            // 합 과 k가 같다면 count + 1, 왼쪽, 오른 쪽 포인터 이동
            if (temp == k) {
                l++;
                r--;
                count++;
            } else if (temp < k) { // 합이 k 보다 작다면 왼쪽 포인터를 이동하여 작은 수를 더 큰 값으로 교체
                l++;
            } else { // 합이 k 보다 크면 오른 쪽 포인터를 이동하여 큰 수를 더 작은 값으로 교체
                r--;
            }
        }

        return count;
    }
}