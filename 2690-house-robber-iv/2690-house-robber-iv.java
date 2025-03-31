class Solution {
    private boolean canRob(int[] nums, int k, int capa) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= capa) {
                count++;
                i++;
            }
            if(count >= k) {
                return true;
            }
        }
        return count >= k;
    }

    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for(int n : nums) {
            l = Math.min(l, n);
            r = Math.max(r, n);
        }

        while(l < r) {
            int mid = l + (r - l) / 2;
            if(canRob(nums, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}