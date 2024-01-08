/*Reverse a linked list. */

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Prob_11 {

    Node temp,prev,after,curr,head=null;

    public void add_beg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void display(){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void reverse(){
        prev=null;
        curr=head;
        after=null;

        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }

        head=prev;
    }
    public static void main(String[] args) {
        Prob_11 l1=new Prob_11();
        l1.add_beg(10);
        l1.add_beg(13);
        l1.add_beg(24);
        l1.add_beg(50);
        l1.add_beg(52);
        System.out.println("Before Reverse:");
        l1.display();
        l1.reverse();
        System.out.println("After Reverse:");
        l1.display();
    }
}
