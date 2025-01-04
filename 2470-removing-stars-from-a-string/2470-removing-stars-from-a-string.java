class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        // 문자열 s를 문자 배열로 반복문을 돌린다
        for (char c : s.toCharArray()) {
            if (c == '*') { // c 가 * 이면 pop
                stack.pop();
            } else { // 아니면 push
                stack.push(c);
            }
        }

        // stack의 요소들을 sb에 넣기
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}