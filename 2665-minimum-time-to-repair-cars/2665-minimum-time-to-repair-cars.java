class Solution {
    private boolean check(long mid, int[] ranks, int cars) {
        long repairs = 0;
        for(int n : ranks) {
            repairs += (long) Math.sqrt(mid / n);
            if (repairs >= cars) return true;
        }

        return false;
    }


    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long r = (long) 1e14;

        while(l < r) {
            long mid = l + (r - l) / 2;

            if(check(mid, ranks, cars)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        
        return l;
    }
}