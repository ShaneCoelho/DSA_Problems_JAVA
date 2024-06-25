//Implement a hash map from scratch.

class MyHashMap {

    int SIZE=1000;
    LinkedList<Entry>[] map; //Array of data type linked list

    public MyHashMap() {
        map= new LinkedList[SIZE];

        for(int i=0;i<SIZE;i++){
            map[i]=new LinkedList<Entry>(); //each array item is initially null. Making each element an empty linked list
        }
    }
    
    public void put(int key, int value) {
        int bucket=getBucket(key);
        LinkedList<Entry> entries=map[bucket];

        for(int i=0;i<entries.size();i++){
            Entry entry=entries.get(i);
            if(entry.key==key){
                entry.value=value;
                return;
            }
        }
        entries.add(new Entry(key,value));
    }
    
    public int get(int key) {
        int bucket=getBucket(key);
        LinkedList<Entry> entries=map[bucket];

        for(int i=0;i<entries.size();i++){
            Entry entry=entries.get(i);
            if(entry.key==key){
                return entry.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int bucket=getBucket(key);
        LinkedList<Entry> entries=map[bucket];

        for(int i=0;i<entries.size();i++){
            Entry entry=entries.get(i);
            if(entry.key==key){
                entries.remove(entry);
                break;
            }
        }

    }

    private int getBucket(int key){ //This is the hash function
        return key % SIZE;
    }

    private class Entry{
        int key;
        int value;

        Entry(int key, int value){
            this.key=key;
            this.value=value;
        }
    }


}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */