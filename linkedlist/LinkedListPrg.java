import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListPrg {

    Node head = null;
    Node temp, pre;

    // add node at beginning
    public void add_beg(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // add node at end
    public void add_end(String data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_Node;
        }

    }

    // add node at specified position

    public void add_specific(String data, int pos) {
        if (pos == 1) {
            add_beg(data);
        } else {
            Node newNode = new Node(data);
            temp = head;
            for (int i = 3; i <= pos; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    // delete node at start

    public void delete_start() {
        if (head == null) {
            System.out.println("The Linked List is empty");
        } else {
            head = head.next;
        }
    }

    // delete node at end

    public void delete_end() {
        if (head == null) {
            System.out.println("The Linked List is empty");
        } else {
            temp = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
        }
    }

    // delete node at the specified position

    public void delete_pos(int pos) {
        if (pos == 1) {
            delete_start();
        } else {
            temp = head;
            for (int j = 2; j <= pos; j++) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = temp.next;
        }
    }

    // display linked list
    public void display() {
        temp = head;
        if (temp == null) {
            System.out.println("The Linked List is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListPrg l1 = new LinkedListPrg();
        while (true) {
            System.out.println("Enter 1 to add node at beginning");
            System.out.println("Enter 2 to add node at end");
            System.out.println("Enter 3 to add node at specified position");
            System.out.println("Enter 4 to delete a node at beginning");
            System.out.println("Enter 5 to delete a node at end");
            System.out.println("Enter 6 to delete a node at specified position");
            System.out.println("Enter 7 to display the linked list");
            System.out.println("Enter 8 to exit");
            System.out.println("Enter your choice:");
            int n=sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:{
                    System.out.println("Enter the data");
                    String str=sc.nextLine();
                    l1.add_beg(str);
                    break;
                }
                case 2:{
                    System.out.println("Enter the data");
                    String str=sc.nextLine();
                    l1.add_end(str);
                    break;
                }
                case 3:{
                    System.out.println("Enter the data");
                    String str=sc.nextLine();
                    System.out.println("Enter the position");
                    int pos=sc.nextInt();
                    sc.nextLine();
                    l1.add_specific(str, pos);
                    break;
                }
                case 4:{
                    l1.delete_start();
                    break;
                }
                case 5:{
                    l1.delete_end();
                    break;
                }
                case 6:{
                    System.out.println("Enter the position");
                    int pos=sc.nextInt();
                    sc.nextLine();
                    l1.delete_pos(pos);
                    break;
                }
                case 7:{
                    l1.display();
                    break;
                }
                case 8:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Please enter a proper choice");
                    break;
                }
            }
        }

    }
}
