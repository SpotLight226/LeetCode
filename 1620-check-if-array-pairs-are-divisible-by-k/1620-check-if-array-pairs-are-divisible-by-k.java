class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] temp = new int[k]; // 각 짝을 표시하기 위한 배열

        for (int n : arr) {
            int index = n % k; // arr 배열을 k로 나누었을 때를 인덱스로

            // 인덱스가 0보다 작으면 k를 더해 음수인덱스로
            if (index < 0) {
                index = index + k;
            }
            temp[index]++; // 각 인덱스의 값을 + 1
        }

        // 짝 배열의 모든 값은 2로 나누었을 때 0이 되어야 짝이 맞는다
        if (temp[0] % 2 != 0) {
            return false;
        }

        // 가장 앞에서 반만 확이하면 됨
        for (int i = 1; i <= k / 2; i++) {
            // 각 짝을 비교한다
            // ex) [1] 과 [k - 1](짝 배열의 가장 뒤의 숫자) 를 비교해서 똑같은지
            if (temp[i] != temp[k - i]) {
                return false;
            }
        }

        return true;
    }
}