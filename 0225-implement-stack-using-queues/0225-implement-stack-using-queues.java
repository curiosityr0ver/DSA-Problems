class MyStack {
        Queue<Integer> q1, q2;
        boolean curr = false;
    

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        
    }
    
    public void push(int x) {
        if(curr) q1.add(x);
        else q2.add(x);
    }
    
    public int pop() {
        if(curr) {
            while(q1.size() > 1) q2.add(q1.remove());
            curr = !curr;
            return q1.remove();
        } else {
            while(q2.size() > 1) q1.add(q2.remove());
            curr = !curr;
            return q2.remove();
        }
        
    }
    
    public int top() {
        
        if(curr) {
            while(q1.size() > 1) q2.add(q1.remove());
            int res = q1.remove();
            q2.add(res);
            curr = !curr;
            return res;
        } else {
            while(q2.size() > 1) q1.add(q2.remove());
            int res = q2.remove();
            q1.add(res);
            curr = !curr;
            return res;
        }
    }
    
    public boolean empty() {
        
        return q1.size() == 0 && q2.size() == 0;
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