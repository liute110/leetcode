package array;
import java.util.ArrayList;
import java.util.HashMap;

public class RandomizedSet {

	int len;
	HashMap<Integer,Integer> map;  
	ArrayList<Integer> list;
	
    /** Initialize your data structure here. */
    public RandomizedSet() {
    	len = 0;
    	map = new HashMap<Integer,Integer>();
    	list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(map.containsKey(val) && map.get(val) >= 0) return false;
    	if(len < list.size()) list.set(len, val);
    	else list.add(val);
    	map.put(val, len);
    	len ++;
    	return true;
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(!map.containsKey(val) || map.get(val) < 0) return false;
    	int index = map.get(val);
    	list.set(index, list.get(len-1));
    	map.put(list.get(index), index);
    	map.put(val, -1);
    	len --;
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	if(len <= 0) return -1;
    	int seed = (int)(1+Math.random()*(len-1+1));
    	return list.get(seed-1);
    	
    }

}
