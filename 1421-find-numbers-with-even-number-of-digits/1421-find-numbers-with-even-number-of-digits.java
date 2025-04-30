class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int n : nums) {
            String str = Integer.toString(n);
            if(str.length() % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}