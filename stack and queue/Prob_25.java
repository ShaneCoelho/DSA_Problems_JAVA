//Implement a double-ended circular queue (deque).

class MyCircularDeque {
    int front=-1;
    int rear=-1;
    int size;
    int[] queue;

    public MyCircularDeque(int k) {
        size=k;
        queue=new int[size];
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }else if(isEmpty()){
            front=rear=0;
        }else{
            front=(front-1+size)%size; //Circular decrement
        }
        queue[front]=value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }else if(isEmpty()){
            front++;
            rear++;
        }else{
            rear=(rear+1)%size;
        }
        queue[rear]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }else if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }else if(front==rear){
            front=rear=-1;
        }else{
            rear=(rear-1+size)%size;//circular decrement
        }
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }else{
            return queue[front];
        }
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }else{
            return queue[rear];
        }
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return front==(rear+1)%size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */