/*Implement a function to add two numbers represented by linked lists.*/

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Prob_15 {

    Node temp,prev,curr,after,head=null;

    void add_end(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void display(){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    void reverse(){
        curr=head;
        prev=after=null;

        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        head=prev;
    }

    void add_num(Node first, Node second){
        int carry=0;
        int sum,digit;
        while(first!=null || second!=null || carry!=0){

            int val1=0;
            if(first!=null){
                val1=first.data;
            }

            int val2=0;
            if(second!=null){
                val2=second.data;
            }
            sum=val1+val2+carry;
            digit=sum%10;
            add_end(digit);
            carry=sum/10;
            if(first!=null){
                first=first.next;
            }
            if(second!=null){
                second=second.next;
            }
        }

    }

    public static void main(String[] args) {
        Prob_15 l1=new Prob_15();
        Prob_15 l2=new Prob_15();
        Prob_15 l3=new Prob_15();
        l1.add_end(1);
        l1.add_end(2);
        l1.add_end(3);
        l1.reverse();

        l2.add_end(1);
        l2.add_end(2);
        l2.reverse();

        l3.add_num(l1.head,l2.head);
        l3.reverse();
        l3.display();


    }
}


//Solved on Code360

import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode p1=head1;
        LinkedListNode p2=head2;

        LinkedListNode dummyNode=new LinkedListNode(-1);

         LinkedListNode temp=dummyNode;


        int carry=0;
        while(p1!=null || p2!=null){
            int sum=carry;
            if(p1!=null){
                sum=sum+p1.data;
            }
            if(p2!=null){
                sum=sum+p2.data;
            }
            if(sum>9){
                carry=1;
            }else{
                carry=0;
            }
            int result=sum%10;
            LinkedListNode node=new LinkedListNode(result);
            temp.next=node;

            temp=temp.next;

            if(p1!=null){
                p1=p1.next;
            }

            if(p2!=null){
                p2=p2.next;
            }


        }

        if(carry==1){
            LinkedListNode node=new LinkedListNode(carry);
            temp.next=node;
            temp=temp.next;
        }

        return dummyNode.next;
    }
}
