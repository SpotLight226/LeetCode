class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        // 고도 배열
        int[] altitudes = new int[len + 1];

        // 마지막 고도 구하기
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += gain[i];
        }
        altitudes[len] = sum; // 마지막 고도

        // 0부터 시작해서 다음 고도는 이전 고도 + gain
        for (int i = 1; i < len; i++) {
            altitudes[i] = altitudes[i - 1] + gain[i - 1];
        }
        
        // 최대 고도
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len + 1; i++) {
            max = Math.max(max, altitudes[i]); // 최대 고도 찾기
        }

        return max;
    }
}