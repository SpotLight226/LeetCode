import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();

        int w1Size = word1.length(); // 문장 1의 길이
        int w2Size = word2.length(); // 문장 2의 길이

        int minSize = Math.min(w1Size, w2Size); // 두 문장 중 길이 짧은 거

        // 짧은 문장의 길이만큼 반복하여 각 문자를 sb에
        for(int i = 0; i < minSize; i++) {
            answer.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // 문장 2가 문장 1보다 길다면
        if(w1Size < w2Size) {
            answer.append(word2.substring(w1Size)); // 문장 2에서 문장 1길이(시작 인덱스)에서 끝까지 잘라 sb에
        } else { // 문장 1이 문장 2보다 길다면
            answer.append(word1.substring(w2Size)); // 문장 1에서 문장 2길이(시작 인덱스)에서 끝까지 잘라 sb에
        }

        return answer.toString();
    }
}