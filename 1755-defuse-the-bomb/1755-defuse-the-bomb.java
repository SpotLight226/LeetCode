class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] result = new int[len];

        for(int i = 0; i < len; i++) {
            if(k > 0) {
                for(int j = i + 1; j < i + 1 + k; j++) {
                    result[i] += code[j % len];
                }
            } else if (k < 0) {
                for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
                    result[i] += code[((j % len) + len) % len];
                }
            }
        }

        return result;
    }
}