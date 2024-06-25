class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node top,temp, head=null;

    public void push(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=top=newNode;
        }else{
            newNode.next=top;
            head=top=newNode;
        }
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }else{
            top=top.next;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }else{
            System.out.println("The top element is:"+top.data);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }else{
            temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}


public class Prob_21_LinkedList {
    public static void main(String args[]){
        Stack s1=new Stack();

        s1.push(5);
        s1.push(6);
        s1.pop();
        s1.pop();
        s1.push(8);
        s1.display();
    }
}
