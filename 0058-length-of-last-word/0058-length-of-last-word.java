class Solution {
    public int lengthOfLastWord(String s) {
        // 배열을 만들어 마지막 요소의 길이 리턴
        /* 
        String[] arr = s.split(" ");

        return arr[arr.length - 1].length();
        */

        // 끝 공백을 제거한 문장에서 가장 마지막 부터 시작해 char가 공백인 곳까지 반복문을 돌려 계산
        int count = 0;
        s = s.trim(); // 끝의 공백 제거

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ') break;

            count++;
        }

        return count;
    }
}