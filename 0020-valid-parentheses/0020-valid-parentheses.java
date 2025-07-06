class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // 결국 이 문제에서는 ([{}]) 의 형태라도,  stack <'(', '[', '{',> 이런 식으로 들어가서,
        // stack 에 넣으면서, 확인하면 됨
        for(char c : s.toCharArray()) {
            // stack 이 비어있지 않을 때,
            if(!stack.isEmpty()) {
                // 이전 문자
                char prev = stack.peek();

                // 이전 문자와 현재 문자 비교해서 동일하다면
                if(check(prev, c)) {
                    stack.pop(); // stack 에서 하나 뺌
                    continue; 
                }
            }

            // stack 이 비어있다면, 문자를 넣음
            stack.push(c);
        }

        // 위의 반복이 다 끝났을 때, stack 이 비어있어야 함
        return stack.isEmpty();
    }
    
    // 이전 문자, 현재 문자 비교
    private boolean check(char prev, char curr) {
        return (prev == '(' && curr == ')') ||
               (prev == '[' && curr == ']') ||
               (prev == '{' && curr == '}');
    }
}