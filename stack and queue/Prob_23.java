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
