class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1; // 배열의 마지막 인덱스

        for (int i = index; i >= 0; i--) {
            // 결국 올라가는 자릿수는 9일 때만 해당된다
            // 해당 요소가 9가 아니라면 +1을 해도 10으로 자릿수를 넘어가지 않으므로 +1한 후 return
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            // 해당 요소가 9라는 뜻이므로 +1했을 때, 0으로 된다, 이 후 앞의 요소에 +1한다
            digits[i] = 0;
        }

        // 만약 배열이 {9} or {9, 9} 등등 일 때 +1을 하면 모든 반복을 거쳐서 {1,0} or {1, 0, 0} 등등이 된다
        // 위의 index 는 마지막 인덱스이므로 길이를 하나 더 늘리기 위해서 +2한다
        int[] newDigits = new int[index + 2];
        newDigits[0] = 1;
        return newDigits;
    }
}