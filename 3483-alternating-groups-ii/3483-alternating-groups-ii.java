class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len = colors.length;
        int[] temp = new int[len + k - 1];

        System.arraycopy(colors, 0, temp, 0, len);
        System.arraycopy(colors, 0, temp, len, k - 1); 

        int count = 0;
        int l = 0;

        for (int r = 0; r < temp.length; r++) {
            if (r > 0 && temp[r] == temp[r - 1]) {
                l = r;  
            }
            
            if (r - l + 1 >= k) {
                count++;  
            }
        }

        return count;
    }
}