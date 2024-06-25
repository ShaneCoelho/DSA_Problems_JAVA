// Implement a stack using arrays/linked list.


class Stack {

    int top = -1;
    int[] stack;
    int n = 10;

    public Stack() {

        stack = new int[n]; // Initialization of arrays must take place inside the constructor
    }

    public boolean stackOverflow(){
        if(top==n-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean stackUnderflow(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int data){

        if(stackOverflow()){
            System.out.println("Stack Overflow");
        }else{
            top++;
            stack[top]=data;
        }

    }

    public void pop(){

        if(stackUnderflow()){
            System.out.println("Stack Underflow");
        }else{
            top--;
        }

    }

    public void stacktop(){

        if(stackUnderflow()){
            System.out.println("Stack Underflow");
        }else{
            System.out.println("The stack top is:"+stack[top]);
        }

    }

    public void display(){
        if(stackUnderflow()){
            System.out.println("Stack Underflow");
        }else{
            for(int i=0;i<=top;i++){
                System.err.println(stack[i]);
            }
        }
    }
}

public class Prob_21 {
    public static void main(String args[]) {
        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);
        s1.pop();
        s1.display();
        s1.stacktop();
    }
}