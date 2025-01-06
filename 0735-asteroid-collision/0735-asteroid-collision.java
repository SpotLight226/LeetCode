class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int n : asteroids) {
            if (n > 0) { // 유성이 오른쪽이면 stack 에 넣기
                stack.push(n);
            } else { // 왼쪽에서 오는 유성일 때,
                // 1. 왼쪽에서 오는 유성과 스택에 저장되어있는 오른쪽에서 오는 유성들을 비교
                // 스택이 비어있지 않고, 스택의 가장 위가 오른쪽에서 오는 유성이며, 
                // 오른쪽에서 오는 유성이 왼쪽에서 오는 유성보다 작다면 스택에서 pop 하기
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -n) {
                    stack.pop(); 
                }
                
                // 스택이 비어있거나, 스택에 들어있는 유성이 왼쪽에서 올 때
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(n);
                }
                
                // 스택에 저장된 오른쪽 에서 오는 유성과 왼쪽 에서 오는 유성이 똑같을 때 pop 해서 제거
                if (stack.peek() == -n) {
                    stack.pop();
                }
            }
        }
        
        // stack 에 저장된 모든 유서들읋 리턴할 answer배열에 저장
        int[] answer = new int[stack.size()]; 
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[i--] = stack.pop();
        }

        return answer;
    }
}