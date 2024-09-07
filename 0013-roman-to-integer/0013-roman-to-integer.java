class Solution {
    public int romanToInt(String s) {
         int answer = 0;
        int n = 0;
        int prev = 0;

        // 맨 뒷자리 부터 시작
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': n = 1;
                          break;
                case 'V': n = 5;
                          break;
                case 'X': n = 10;
                          break;
                case 'L': n = 50;
                          break;
                case 'C': n = 100;
                          break;
                case 'D': n = 500;
                          break;
                case 'M': n = 1000;
                          break;
            }
            // 로마 문자에서 현재의 문자가 이전의 문자보다 작다면 이전 문자의 값에서 현재 문자의 값을 빼는 것으로
            // 4, 9, 40, 90, 400, 900 을 나타낸다
            /*
              MCMXCIV => 1. V = 5, prev = 0 -> answer = 5;
                         2. I = 1, prev = 5 -> answer = 4;
                         3. C = 100, prev = 1 -> answer = 104;
                         4. X = 10, prev = 100 -> answer = 94;
                         5. M = 1000, prev = 10 -> answer = 1094;
                         6. C = 100, prev = 1000 -> answer = 994;
                         7. M = 1000, prev = 100 -> answer = 1994;
            */
            if (n < prev) {
                answer -= n;
            } else {
                answer += n;
            }
            prev = n;
        }
        return answer;
    }
}