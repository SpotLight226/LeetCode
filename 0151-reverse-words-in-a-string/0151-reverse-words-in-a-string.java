import java.util.*;

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split("\\s+"); // 하나 이상 연속된 공백을 포함해 나누어 배열로

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);

            if( i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString().trim(); // 스트링빌더의 불필요한 끝자리 띄어쓰기 제거
    }
}