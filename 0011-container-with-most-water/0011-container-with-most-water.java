class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int max = Integer.MIN_VALUE;

        while (l < r) {
            int lHeight = height[l];
            int rHeight = height[r];

            int temp = 0;

            if (lHeight <= rHeight) {
                temp = lHeight * (r - l);
                if (temp > max) {
                    max = temp;
                }
                l++;

            } else {
                temp = rHeight * (r - l);
                if (temp > max) {
                    max = temp;
                }
                r--;

            }
        }

        return max;
    }
}