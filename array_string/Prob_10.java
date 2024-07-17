/* Implement an algorithm to find the intersection point of two linked lists. */

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Intersection {
    Node temp1, temp2;

    public Intersection(Prob_10 l1, Prob_10 l2) {
        int length1 = find_length(l1);
        int length2 = find_length(l2);
        if(length1==-1||length2==-1){
            System.out.println("The Intersection does not exist");
            System.exit(0);
        }
        System.out.println("Length1:" + length1);
        System.out.println("Length2:" + length2);
        temp1 = l1.head;
        temp2 = l2.head;
        while (length1 > length2) {
            temp1 = temp1.next;
            length1 = length1 - 1;
        }
        while (length2 > length1) {
            temp2 = temp2.next;
            length2 = length2 - 1;
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if (temp1 == null) {
            System.out.println("There is no intersection point");
        } else {
            System.out.println("The intersection point is:" + temp1.data);
        }

    }

    public int find_length(Prob_10 obj) {
        if (obj.head == null) {
            return -1;
        } else {
            int length = 0;
            temp1 = obj.head;
            while (temp1 != null) {
                length = length + 1;
                temp1 = temp1.next;

            }
            return length;
        }
    }
}

public class Prob_10 {

    Node temp, head = null;

    public void add_beg(String data) {
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

    public void add_end(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void intersect(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        Prob_10 l1 = new Prob_10();
        Prob_10 l2 = new Prob_10();
        l1.add_beg("Hi");
        l1.add_beg("hello");
        l2.add_beg("World");
        Node newNode = new Node("Shane");
        l1.intersect(newNode);
        l2.intersect(newNode);
        l1.add_end("Owen");
        l2.add_end("Johann");
        System.out.println("List l1");
        l1.display();
        System.out.println("List l2");
        l2.display();
        Intersection in = new Intersection(l1, l2);

    }

}


//Leetcode problem

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode d1, d2;
        d1 = headA;
        d2 = headB;

        while (d1 != d2) {
            if (d1 == null) {
                d1 = headB;
                d2 = d2.next;
            } else if (d2 == null) {
                d2 = headA;
                d1 = d1.next;
            } else {
                d1 = d1.next;
                d2 = d2.next;
            }
        }

        return d1;
    }
}
