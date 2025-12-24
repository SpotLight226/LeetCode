class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int result = 0;
        int sum = 0;
        Arrays.sort(capacity);

        for(int i = 0; i < apple.length; i++) {
            sum += apple[i];
        }

        for(int i = capacity.length - 1; i >= 0; i--) {
            sum -= capacity[i];
            result++;
            if(sum <= 0) {
                return result;
            }
        }

        return result;

    }
}