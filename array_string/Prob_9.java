/*Implement a function to remove duplicates from an unsorted linked list.*/

import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Prob_9 {

    Node temp,pre,head=null;

    //add node at beginning

    public void add_beg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    //display the linked list

    public void display(){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void remove_duplicates(){
        Map<Integer,Integer> frequency=new HashMap<>();
        pre=temp=head;
        frequency.put(temp.data,1);
        temp=temp.next;
        while(temp!=null){
            int count=frequency.getOrDefault(temp.data,0)+1;
            frequency.put(temp.data,count);
            if(count==1){
                pre=temp;
                temp=temp.next;
            }else{
                pre.next=temp.next;
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Prob_9 l1=new Prob_9();
        l1.add_beg(2);
        l1.add_beg(4);
        l1.add_beg(6);
        l1.add_beg(1);
        l1.add_beg(1);
        l1.add_beg(6);
        l1.add_beg(4);
        l1.display();
        System.out.println("Linked List after duplicates removed:");
        l1.remove_duplicates();
        l1.display();
    }
}



//Solved on Code 360

import java.util.* ;
import java.io.*; 

/************************************************************

    Following is the linked list node structure
    
    class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

************************************************************/


public class Solution {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        // Write your code here	

        LinkedListNode<Integer> curr,prev;
        prev=head;
        curr=head.next;
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(prev.data,1);
        while(curr!=null){
            if(map.containsKey(curr.data)){
                prev.next=curr.next;
                curr=prev.next;
            }else{
                map.put(curr.data,1);
                prev=prev.next;
                curr=curr.next;
            }
        }

        return head;
	}

}
