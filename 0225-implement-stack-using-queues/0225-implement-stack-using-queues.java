class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        // 생성자
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        // 새로운 요소를 넣기
        // 스택은 LIFO(Last In Fist Out) 이기 때문에, 먼저 들어가있던 요소를 빼고, 다시 넣어서
        // 가장 마지막 요소를 앞으로 보낸다 
        queue.add(x);
        for(int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }        
    }
    
    public int pop() {
        // 꺼내기
        return queue.poll();
    }
    
    public int top() {
        // 가장 위에 있는 요소를 보기
        return queue.peek();
    }
    
    public boolean empty() {
        // 큐가 비어있느지 확인
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */