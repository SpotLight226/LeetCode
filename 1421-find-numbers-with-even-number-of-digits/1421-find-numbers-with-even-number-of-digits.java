class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        /*
        // 일반 개수
        for(int n : nums) {
            String str = Integer.toString(n);
            if(str.length() % 2 == 0) {
                result++;
            }
        }
        */

        for(int n : nums) {
            int digits = (int)(Math.log10(n)) + 1;
            if(digits % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}