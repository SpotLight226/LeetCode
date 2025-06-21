class Solution {
    public int lengthOfLastWord(String s) {
        // 마지막 인덱스 (공백이 아닌 곳)
        int end = s.length() - 1;

        // 문장의 뒤에가 공백일 수 있기 때문에, 공백이 아닌 위치까지 이동
        while(end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        // 마지막 문자에서 앞에 공백이 있는 인덱스
        int start = end;

        // 문자가 공백이 아니면, 계속 인덱스를 앞으로 이동해서 공백을 찾는다
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        // 마지막 문자의 위치 - 문장의 바로 앞 공백 위치
        return end - start;
    }
}