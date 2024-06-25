//Implement a circular queue.

class MyCircularQueue {

    int front = -1;
    int rear = -1;
    int size;
    int[] queue;

    public MyCircularQueue(int k) {
        size = k;
        queue = new int[size];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else if(front==-1){
            front++;
            rear++;
        }else{
            rear = (rear + 1) % size; //Circular increment
        }
        queue[rear]=value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else if(front==rear){
            front=rear=-1;
        }else{
            front = (front + 1) % size; //Circular increment
        }
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }else{
            return queue[front];
        }
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return queue[rear];
        }
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(front == (rear + 1) % size){
            return true;
        }else{
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