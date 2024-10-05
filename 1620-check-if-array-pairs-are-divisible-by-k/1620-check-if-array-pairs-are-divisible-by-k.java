class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] temp = new int[k]; // 각 짝을 표시하기 위한 배열

        for (int n : arr) {
            int index = n % k;

            if (index < 0) {
                index = index + k;
            }
            temp[index]++;
        }

        if (temp[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (temp[i] != temp[k - i]) {
                return false;
            }
        }

        return true;
    }
}