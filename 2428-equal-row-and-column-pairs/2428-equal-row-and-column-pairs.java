class Solution {
    public int equalPairs(int[][] grid) {
        int answer = 0;
        int temp = 0;
        int row = 0;
        while(temp <= grid.length-1) {
            HashMap<Integer,Integer> map=new HashMap<>();

            for(int i = 0; i < grid.length; i++) {
                map.put(i, grid[row][i]);
            }

            for(int i=0;i<grid.length;i++) {
                int cur=0;

                for(int k=0;k<grid.length;k++) {

                    if(map.get(k)!=grid[k][i]) {
                        cur=0;
                        break;
                    } else {
                        cur=1;        
                    }
                }

                answer += cur;
            }

            row++;
            temp++;
        }
        return answer;
    }
}