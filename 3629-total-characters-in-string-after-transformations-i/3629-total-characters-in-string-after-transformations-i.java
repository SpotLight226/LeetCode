class Solution {
    // modulo 연산 => 안전한 덧셈 연산
    private static int mod = 1000000007; // 표준 모듈러 연산값
    // 보통 (a + b) % mod만 해도 충분
    private int mod_add(int a, int b) {
        a %= mod;
        b %= mod;
        // a + b가 음수일 경우 mod 결과가 음수가 될 수 있음 
        return ((a + b) % mod + mod) % mod;
    }

    public int lengthAfterTransformations(String s, int t) {
        // 빈도 배열
        int[] nums = new int[26];
        for(char c : s.toCharArray()) {
            nums[c - 'a']++;
        }

        while(t-- > 0) {
            int[] arr = new int[26]; // 계산 위해 기본 배열

            // 문자열 배열 계산
            for(int i = 0; i < 26; i++) {
                // 문자가 z 라면
                if(i == 25 && nums[i] > 0) {
                    // a, b 로 변환을 수행하여 길이 계산
                    arr[0] = mod_add(arr[0], nums[i]);
                    arr[1] = mod_add(arr[1], nums[i]);
                    
                } else if(i < 25) { // 다른 문자일 시
                    arr[i + 1] = mod_add(arr[i + 1], nums[i]);
                }
            }
            // 한 번 변환을 거친 문자 빈도 배열을 갱신
            nums = arr; 
        }

        // 최종 결과를 계산
        int result = 0;
        for(int n : nums) {
            result = mod_add(result, n);
        }

        return result;
    }
}