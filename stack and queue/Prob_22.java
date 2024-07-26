//Implement a queue using stacks.

class Queue {
    int top1 = -1;
    int top2 = -1;
    int[] stack1, stack2;
    int n = 10;

    Queue() {
        stack1 = new int[n];
        stack2 = new int[n];
    }

    public boolean isFull() {
        if (top1 == n - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top1 == -1 && top2 == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            top1++;
            stack1[top1]=data;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else if(top2==-1){
            while(top1!=-1){
                top2++;
                stack2[top2]=stack1[top1];
                top1--;
            }
            top2--;
        }else{
            top2--;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else if(top2==-1){
            while(top1!=-1){
                top2++;
                stack2[top2]=stack1[top1];
                top1--;
            }
            System.out.println(stack2[top2]);
        }else{
            System.out.println(stack2[top2]);
        }
    }
}

public class Prob_22 {
    public static void main(String[] args) {
        Queue q1=new Queue();

        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.pop();
        q1.pop();
        q1.pop();
        q1.peek();
    }
}


//Solved on Leetcode

class MyQueue {
    Stack<Integer> input,output;
    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        return output.pop();
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        return output.peek();
    }
    
    public boolean empty() {
        if(output.isEmpty() && input.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */