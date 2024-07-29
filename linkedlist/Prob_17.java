/*Detect a palindrome linked list. */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Palindrome {

    Node temp, slow, fast, mid, reverse, curr, prev, after, temp1, temp2, head = null;

    public void add_beg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void find_mid() {
        slow=head;
        fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        mid=slow;

    }

    public void reverse_after_mid(){
        curr=mid.next;
        prev=null;
        after=null;

        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        reverse=prev;
        mid.next=reverse;

    }

    public boolean check_palindrome(){
        temp1=head;
        temp2=mid.next;

        if(temp1.next==null){
            return true;
        }

        while(temp2!=null){
            if(temp1.data==temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
            }else{
                return false;
            }
        }
        return true;
    }
}

public class Prob_17 {
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();

        p1.add_beg(1);
        p1.add_beg(2);
        p1.add_beg(2);
        p1.add_beg(1);
        p1.display();
        p1.find_mid();
        p1.reverse_after_mid();
        System.out.println("After Reverse:");
        p1.display();
        boolean result=p1.check_palindrome();
        if(result==true){
            System.out.println("The Linked List is a palindrome");
        }else{
            System.out.println("The Linked List is not a palindrome");
        }

    }

}


//Solved on Code360

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 class Solution {

    public static Node reverse(Node head){
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        return prev;
    }
    public static boolean isPalindrome(Node head) {
        // write your code here

        Node fast=head;
        Node slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
        }

        Node newHead=reverse(slow.next);

        Node first=head;
        Node second=newHead;

        while(second!=null){
            if(first.data!=second.data){
                reverse(newHead);
                return false;
            }

            first=first.next;
            second=second.next;
        }

        reverse(newHead);
        return true;

    }
}
