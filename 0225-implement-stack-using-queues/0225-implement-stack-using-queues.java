class MyStack {
        //Psuedo Stack
        Queue<Integer> q1 = new LinkedList<Integer>();
        //Queue
        Queue<Integer> q2 = new LinkedList<Integer>();   

    public MyStack() {
  
    }
    
    public void push(int x) {
        int temp;
        while(q1.peek() != null){
            temp = q1.remove();
            q2.add(temp);
        }
        q1.add(x);
        while(q2.peek() != null){
            temp = q2.remove();
            q1.add(temp);
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        else{
            return false;
        }
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