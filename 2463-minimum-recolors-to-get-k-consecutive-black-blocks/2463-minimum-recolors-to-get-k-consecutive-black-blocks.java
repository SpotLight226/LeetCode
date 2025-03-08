class Solution {
    public int minimumRecolors(String blocks, int k) {
        int black = 0;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < blocks.length(); i++) {
            if(i - k >= 0 && blocks.charAt(i - k) == 'B' ) {
                black--;
            }

            if(blocks.charAt(i) == 'B') {
                black++;
            }

            result = Math.min(result, k - black);
        }

        return result;
    }
}