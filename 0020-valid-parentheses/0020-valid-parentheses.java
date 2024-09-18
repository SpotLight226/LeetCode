class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            // c가 (, {, [ 라면 스택에 넣기 
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else { // 닫는 괄호라면
                // 스택이 비어있다면 false리턴
                if (stack.isEmpty()) {
                    return false;
                }

                // 닫는 괄호일 때, 스택의 가장 위에 있는 c가 짝이 맞는 여는 괄호인지 확인
                char temp = stack.peek();
                if (c == ')' && temp == '(' || c == '}' && temp == '{' || c == ']' && temp == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        // 모든 과정을 반복했을 때 스택이 비어있어야 true
        return stack.isEmpty();        
    }
}