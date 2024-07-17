/*Detect a cycle in a linked list. */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Prob_12 {
    Node hare, tortoise, temp, head = null;

    public void add_beg(int data) {
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void create_cycle(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void display(){
        temp=head;

        while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
        }
    }

    public void check_cycle(){
        hare=tortoise=head;
        do{
            tortoise=tortoise.next;
            hare=hare.next;
            if (hare != null) {
                hare = hare.next;
            }
        }while(tortoise!=hare && hare.next!=null);

        if(tortoise==hare){
            System.out.println("There is a cycle");
        }else{
            System.out.println("There is not a cycle");
        }

    }

    public static void main(String[] args) {
        Prob_12 l1=new Prob_12();
        l1.add_beg(10);
        l1.add_beg(23);
        l1.add_beg(17);
        l1.create_cycle(50);
        l1.check_cycle();
    }

}


//Solved on leetcode

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head==null){
            return false;
        }

        ListNode fast,slow;
        fast=slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
        
    }
}