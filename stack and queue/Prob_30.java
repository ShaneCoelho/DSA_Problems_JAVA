//Design a data structure that supports the following operations: insert, delete, get_random_element. All operations should be done in constant time.

import java.util.Vector;

class RandomizedSet {

    HashMap<Integer, Integer> hash_map;
    Vector<Integer> v;
    Random rand;
    int rand_index, last_val, val_index;

    public RandomizedSet() {
        hash_map = new HashMap<Integer, Integer>();
        v = new Vector<Integer>();// in vector it is okk if we do not provide the size, it will dynamically grow
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(hash_map.containsKey(val)){
            return false;
        }

        v.addElement(val);
        hash_map.put(val, v.size()-1);

        return true;
    }
    
    public boolean remove(int val) {
        if(!hash_map.containsKey(val)){
            return false;
        }

        val_index=hash_map.get(val);
        last_val=v.get(v.size()-1);
        v.set(val_index,last_val);
        hash_map.put(last_val,val_index);
        v.remove(v.size()-1);
        hash_map.remove(val);

        return true;


    }
    
    public int getRandom() {

        rand_index=rand.nextInt(v.size());

        return v.get(rand_index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */