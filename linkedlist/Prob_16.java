/* Clone a linked list with next and random pointer. */

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node random;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random=null;
    }
}

class LinkedList {
    Node temp1, temp2, original_head = null, clone_head = null, original_node=null, clone_node=null;

    public void add_beg(int data) {
        Node newNode = new Node(data);
        if (original_head == null) {
            original_head = newNode;
        } else {
            newNode.next = original_head;
            original_head = newNode;
        }
    }

    public void display(Node head) {
        temp1 = head;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
    }

    public void add_random(){
        Scanner ip = new Scanner(System.in);
        temp1=original_head;
        while(temp1!=null){
            System.out.println("Enter the random for "+temp1.data);
            int random_pointer = ip.nextInt();
            temp2=original_head;
            while(temp2.data!=random_pointer){
                temp2=temp2.next;
            }
            temp1.random=temp2;
            temp1=temp1.next;
        }
    }

    public Node clone() {
        temp1 = original_head;
        while (temp1 != null) {
            if (clone_head == null) {
                Node newNode = new Node(temp1.data);
                clone_head = temp2 = newNode;
            } else {
                Node newNode = new Node(temp1.data);
                temp2.next = newNode;
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    
        return clone_head;
    }

    public void check_random(){
        temp1=clone_head;

        for(int i=0;i<5;i++){
            System.out.println(temp1.data);
            temp1=temp1.random;
        }
    }

    public void join_nodes(){
        original_node=original_head;
        clone_node=clone_head;

        while(clone_node!=null){
            temp1=original_node.next;
            original_node.next=clone_node;
            original_node=temp1;
            temp2=clone_node.next;
            clone_node.next=original_node;
            clone_node=temp2;

        }
    }

    public void clone_random(){
        original_node=original_head;
        clone_node=clone_head;

        while(original_node!=null){
            if(original_node.next!=null){
                if(original_node.random!=null){
                    original_node.next.random=original_node.random.next;
                }
                else{
                    original_node.next=original_node.random;
                }
            }
            
            original_node=original_node.next.next;
        }
    }

    public void break_chain(){
        original_node=original_head;
        clone_node=clone_head;

        while(clone_node.next!=null && original_node.next!=null){
            original_node.next=clone_node.next;
            original_node=original_node.next;
            clone_node.next=original_node.next;
            clone_node=clone_node.next;
        }
    }
    
}

public class Prob_16 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.add_beg(2);
        l1.add_beg(3);
        l1.add_beg(5);
        l1.add_beg(8);
        Node clone_head = l1.clone();
        System.out.println("Original:");
        l1.display(l1.original_head);
        System.out.println("Clone:");
        l1.display(clone_head);
        l1.add_random();
        // l1.check_random();
        l1.join_nodes();
        System.out.println("Joint Nodes");
        l1.display(l1.original_head);
        l1.clone_random();
        l1.break_chain();
        System.out.println("Original node:");
        l1.display(l1.original_head);
        System.out.println("Clone node:");
        l1.display(l1.clone_head);
        System.out.println("Random:");
        l1.check_random();

    }
}


//Solved on Code360

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node random;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.random = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.random = null;
     }
     Node(int data, Node next, Node random)
     {
         this.data = data;
         this.next = next;
         this.random = random;
     }
 }

 *****************************************************************/

 class Solution {
    public static Node cloneLL(Node head) {
        // Write your code here.

        //Insert Copy nodes in between
        Node temp=head;

        while(temp!=null){
            Node copy=new Node(temp.data);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }

        //Connect random pointers

        temp = head;
        while(temp!=null){
            temp.next.random=temp.random;
            temp=temp.next.next;
        }

        //Connect next pointer

        temp=head;
        Node dummyNode=new Node(-1);
        Node res=dummyNode;

        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }


        return dummyNode.next;
    }
}