package array;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int longestConsecutive(int[] nums) {
    	int cur = 0;
    	int max = 0;
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i:nums)
    		map.put(i, 0);
    	for(int i=0;i<nums.length; i++) {
    		cur = 1;
    		int curn = nums[i]-1;
    		while(true) {
    			if(map.containsKey(curn)) {
    				map.remove(curn);
    				cur++;
    				curn--;
    			}
    			else break;
    		}
    		curn = nums[i]+1;
    		while(true) {
    			if(map.containsKey(curn)) {
    				map.remove(curn);
    				cur++;
    				curn++;
    			}
    			else break;
    		}
    		if(cur>max) max = cur;
    	}
    	return max;
        
    }

}
