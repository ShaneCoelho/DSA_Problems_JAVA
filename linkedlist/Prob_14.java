/*Find the kth to last element of a singly linked list. */

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Prob_14 {
    Node fast,temp,slow,head=null;

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

    public int k_element(int k){
        fast=slow=head;

        if(fast==null){
            return -1;
        }

        for(int i=0;i<k;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        return slow.data;

    }

    public static void main(String[] args) {
        Prob_14 l1=new Prob_14();
        l1.add_beg(20);
        l1.add_beg(30);
        l1.add_beg(10);
        l1.add_beg(56);
        l1.add_beg(34);
        l1.add_beg(87);
        l1.display();

        int k=3;

        int element=l1.k_element(k);

        if(element==-1){
            System.out.println("The list is empty");
        }else{
            System.out.println("kth to last element is:"+element);
        }
    }
}
