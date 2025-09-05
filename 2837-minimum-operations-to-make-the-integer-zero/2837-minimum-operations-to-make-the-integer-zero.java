class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i = 1; i <= 60; i++) {
            long temp = 1L * num1 - 1L * num2 * i;

            if(temp < i) {
                return -1;
            }

            if(i >= Long.bitCount(temp)) {
                return i;
            }
        }

        return -1;
    }
}