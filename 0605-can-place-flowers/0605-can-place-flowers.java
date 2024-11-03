class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for(int i = 0; i < flowerbed.length; i++) {
            boolean left = false;
            boolean right = false;

            if(i == 0 || flowerbed[i - 1] == 0) {
                left = true;
            }

            if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                right = true;
            }

            if(left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }

           
        }
         return n <= 0;
    }
}