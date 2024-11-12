class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        int[] arr = new int[s.length()]; // 미리 모음인지 확인하기 위한 int 배열

        // s의 문자들이 모음인지 확인해서 모음이면 1, 자음이면 0 으로 
        for (int i = 0; i < s.length(); i++) {
            arr[i] = checkVowel(s.charAt(i));
        }

        // 처음 k개의 모음 카운트
        for (int i = 0; i < k; i++) {
            count += arr[i];
        }

        int max = count; // 최대 모음 값

        // 슬라이딩 윈도우로 k 부터 마지막 문자 까지 확인하며 최대 값 확인
        for (int i = k; i < arr.length; i++) {
            count += arr[i] - arr[i - k]; // ex) arr[k] - arr[0] ( + k번째 - 첫 번째)
            max = Math.max(max, count);
        }

        return max;
    }
    
    // 모음 확인
    public int checkVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }

}