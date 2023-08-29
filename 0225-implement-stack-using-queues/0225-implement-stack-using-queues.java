class MyStack {
        Queue<Integer> q1, q2;
        int curr = 0;
    

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        
    }
    
    public void push(int x) {
        if(curr == 0) q1.add(x);
        else q2.add(x);
    }
    
    public int pop() {
        if(curr == 0) {
            while(q1.size() > 1) q2.add(q1.remove());
            
            for(int ele: q2) System.out.print(ele + ", ");
            System.out.println();
            
            curr = 1;
            return q1.remove();
        } else {
            while(q2.size() > 1) q1.add(q2.remove());
            
            for(int ele: q1) System.out.print(ele + ", ");
            System.out.println();
            
            curr = 0;
            return q2.remove();
        }
        
    }
    
    public int top() {
        
        if(curr == 0) {
            while(q1.size() > 1) q2.add(q1.remove());
            
            int res = q1.remove();
            
            q2.add(res);
            
            curr = 1;
            return res;
        } else {
            while(q2.size() > 1) q1.add(q2.remove());
            
            int res = q2.remove();
            
            q1.add(res);
            
            curr = 0;
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