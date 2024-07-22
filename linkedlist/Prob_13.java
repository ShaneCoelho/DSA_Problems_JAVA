/*Merge two sorted linked lists. */

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Prob_13 {

    Node dummy,ptr1,ptr2,ptr3,temp,head=null;

    public void add_end(int data){
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

    public void display(){
        temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void merge_list(Prob_13 l1, Prob_13 l2) {
        dummy = null;
        ptr1 = l1.head;
        ptr2 = l2.head;
    
       while(ptr1!=null && ptr2!=null){
        if(dummy==null){
            if(ptr1.data>ptr2.data){
                dummy=ptr3=ptr2;
                ptr2=ptr2.next;
            }else{
                dummy=ptr3=ptr1;
                ptr1=ptr1.next;
            }
        }else if(ptr1.data>ptr2.data){
            ptr3.next=ptr2;
            ptr3=ptr3.next;
            ptr2=ptr2.next;

        }else{
            ptr3.next=ptr1;
            ptr3=ptr3.next;
            ptr1=ptr1.next;
        }
       }
       
       while(ptr1!=null){
        ptr3.next=ptr1;
        ptr3=ptr3.next;
        ptr1=ptr1.next;
       }

       while(ptr2!=null){
        ptr3.next=ptr2;
        ptr3=ptr3.next;
        ptr2=ptr2.next;
       }
    }

    public void display_merge(){
        temp=dummy;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Prob_13 l1=new Prob_13();
        Prob_13 l2=new Prob_13();

        l1.add_end(2);
        l1.add_end(4);
        l1.add_end(5);
        l1.add_end(10);
        System.out.println("First Linked List:");
        l1.display();
        l2.add_end(3);
        l2.add_end(7);
        l2.add_end(8);
        System.out.println("Second Linked List:");
        l2.display();
        l1.merge_list(l1,l2);
        System.out.println("Merged List:");
        l1.display_merge();

    }
}


//Solved on Code360

import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> dummynode= new LinkedListNode<Integer>(-1);

        LinkedListNode<Integer> temp=dummynode;

        LinkedListNode<Integer> t1=first;
        LinkedListNode<Integer> t2=second;

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                temp.next=t1;
                temp=temp.next;
                t1=t1.next;
            }else{
                temp.next=t2;
                temp=temp.next;
                t2=t2.next;
            }
        }

        if(t1==null){
            temp.next=t2;
        }else{
            temp.next=t1;
        }

        return dummynode.next;

	}
}
