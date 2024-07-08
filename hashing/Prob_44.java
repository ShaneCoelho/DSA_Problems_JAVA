//Design and implement a Least Recently Used (LRU) cache.

class LRUCache {

    class Node{
        Node next,prev;
        int key,value;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }

    }

    HashMap<Integer,Node> map;
    int capacity;
    Node head,tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>(capacity);
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            addToHead(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            map.remove(key);
        }else{
            if(map.size()>=capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
        }
        Node newNode=new Node(key,value);
        addToHead(newNode);
        map.put(key,newNode);  
    }

    public void remove(Node curr){
        curr.next.prev=curr.prev;
        curr.prev.next=curr.next;
    }

    public void addToHead(Node node){
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */