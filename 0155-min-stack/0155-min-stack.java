class MinStack {

    private List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        int[] top;
        if(st.isEmpty()) {
            top = new int[]{val, val};
        } else {
            top = st.get(st.size() - 1);
        }

        int min = top[1];
        if(min > val) {
            min = val;
        }

        st.add(new int[]{val, min});
    }
    
    public void pop() {
        st.remove(st.size() - 1);
    }
    
    public int top() {
        if(st.isEmpty()) {
            return -1;
        } else {
            return st.get(st.size() - 1) [0];
        }
    }
    
    public int getMin() {
        if(st.isEmpty()) {
            return -1;
        } else {
            return st.get(st.size() - 1) [1];
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */