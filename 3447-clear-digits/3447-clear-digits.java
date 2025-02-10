class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}