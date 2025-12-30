class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j <grid[i].length; j++) {
                if(grid[i][j] < 0) { // 음수라면 내림차순 정렬이기에 다음 수들은 다 음수다
                    result += grid[i].length - j; // 해당 집합의 개수에 현재 인덱스를 빼서, 남은 수의 개수를 구한다
                    break;
                }
            }
        }

        return result;
    }
}