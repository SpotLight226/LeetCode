class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 1;
        int r = 0;
        int result = 0;

        for(int candy : candies) {
            r = Math.max(r, candy);
        }
        
        while(l <= r) {
            int mid = l + (r - l) / 2;
            long pile = 0;

            for(int candy : candies) {
                pile += candy / mid;
            }

            if(pile >= k) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return result;

    }
}