package array;

import java.util.HashMap;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++) {
        	sum += nums[i];
        	res += map.getOrDefault(sum-k, 0);
        	map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }

}
