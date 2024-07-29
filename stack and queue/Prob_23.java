//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    int curr;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // If minStack is empty or the new value is less than or equal to the current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
       if(stack.isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            curr=stack.pop();
            if(curr==minStack.peek()){
                minStack.pop();
            }
        }

    }

    public int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        }
        return minStack.peek();
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

 //Solved without using extra space

 class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st=new Stack<>();
        min=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long data=(long) val;
        if(st.isEmpty()){
            st.push(data);
            min=data;
        }else{
            if(data<min){
                st.push(2*data-min);
                min=data;
            }else{
                st.push(data);
            }
        }
    }
    
    public void pop() {
        if(st.peek()<min){
            min=2*min-st.peek();
            st.pop();
        }else{
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek()<min){
            return (int) min;
        }else{
            long data=st.peek();
            return (int)data;
        }
    }
    
    public int getMin() {
        return (int) min;
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
