class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int size = len * len;
        int[] count = new int[size + 1];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                count[grid[i][j]]++;
            }
        }

        int a = -1;
        int b = -1;

        for(int i = 1; i <= size; i++) {
            if(count[i] == 2) {
                a = i;
            } else if(count[i] == 0) {
                b = i;
            }
        }

        return new int[]{a, b};
    }
}