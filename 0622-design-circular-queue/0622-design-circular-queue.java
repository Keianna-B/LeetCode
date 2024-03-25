class MyCircularQueue {
    int[] queue;
    int front = 0, rear = 0,size = 0;

    public MyCircularQueue(int k) {
        queue = new int[k];
        Arrays.fill(queue,-1);
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            rear = front = 0;
            queue[front]= value;
            size++;
            return true;
        }
        rear++;
        size++;
        rear = rear % queue.length;
        queue[rear]= value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        queue[front]= -1;
        front++;
        size--;
        front = front % queue.length;
        return true;
    }
    
    public int Front() {
        return queue[front];
    }
    
    public int Rear() {
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */