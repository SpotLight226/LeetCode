class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int tn = m * n;
        int result = 0;

        int[] arr = new int[tn];
        int idx = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        Arrays.sort(arr);

        int mid = tn / 2;
        int median = arr[mid];

        for(int num : arr) {
            if(Math.abs(num - median) % x != 0) {
                return -1;
            }
            
            result += Math.abs(num - median) / x;
        }

        return result;
    }
}