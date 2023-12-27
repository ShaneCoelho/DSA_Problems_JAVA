class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
}



public class LinkedListPrg {

    Node head=null;
    Node temp;

    //add node at beginning
    public void add_beg(String data){
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //add node at end
    public void add_end(String data){
        Node new_Node=new Node(data);
        if(head==null){
            head=new_Node;
        }else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_Node;
        }

    }

    // display linked list
    public void display(){
        temp=head;
        if(temp==null){
            System.out.println("The Linked List is empty");
        }else{
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    }

    public static void main(String[] args) {
        LinkedListPrg l1=new LinkedListPrg();
        l1.add_beg("hi");
        l1.add_beg("why");
        l1.add_end("at end");
        l1.display();
    }
}
