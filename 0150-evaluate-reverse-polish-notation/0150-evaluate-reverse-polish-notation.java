class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String c : tokens) {
            // + (더하기)
            if (c.equals("+")) {
                // 스택에 있는 숫자를 2개 pop 해서 더하고 넣기
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) { // - (빼기)
                // 빼기는 뒤에 있는 숫자가 앞으로 가야함
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")) { // *(곱하기)
                // 스택에 있는 숫자 2개를 pop 해서 곱하고 넣기
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) { // /(나누기)
                // 나누기는 뒤에 있는 숫자가 앞으로 가야함
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else { // c가 숫자라면, 스택에 넣기
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.pop();
    }
}