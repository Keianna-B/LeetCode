class MyCircularQueue {
    int index = -1;
    int[] queue;
    public MyCircularQueue(int k) {
        queue = new int[k];
        Arrays.fill(queue,-1);
        //tail = -1;
    }
    
    public boolean enQueue(int value) {
        if(index+1 == queue.length){
        return false;
        }
        index++;
        queue[index]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(queue[0]==-1){
            return false;
        }
        for(int i=0; i < index; i++){
            queue[i]=queue[i+1];
        }
        queue[index]=-1;
        index--;
        return true;
    }
    
    public int Front() {
        return queue[0];
    }
    
    public int Rear() {
        if(index == queue.length || index<0){
        return -1;
        }
        return queue[index];
    }
    
    public boolean isEmpty() {
        if(queue[0] == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(queue[queue.length-1] != -1){
            return true;
        }
        else{
            return false;
        }
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