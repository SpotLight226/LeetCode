class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007; // 언더스코어를 사용한 표기법
        int oddCount = 0; // 홀수 개수
        int evenCount = 1; // 짝수 개수
        int preFixSum = 0; // 누적합

        int result = 0;

        for(int n : arr) {
            preFixSum += n; // 누적합에 더하기
            
            if (preFixSum % 2 == 0) { // // 짝수 일 때
                result += oddCount; // 누적합이 짝수라면 이전의 oddCount만큼의 새로운 홀수 부분배열이 생김
                evenCount++; // 
            } else { // 홀수라면
                result += evenCount; // evenCount만큼 새로운 홀수 부분배열이 생김
                oddCount++; 
            }

            result %= mod;
        }

        return (int) result;
    }
}