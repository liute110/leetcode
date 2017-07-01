package array;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ret = nums[0] + nums[1] + nums[2];
        int len = nums.length;
        for(int i=0; i<=len-3; i++) {
        	int j = i + 1;
        	int k = len -1;
        	while(j<k) {
        		int sum = nums[i] + nums[j] + nums[k];
        		if(Math.abs(sum-target)<Math.abs(ret-target))
        			ret = sum;
        		if(sum < target)
        			++j;
        		else if(sum>target) 
        			--k;
        		else {
        			++j;
        			--k;
        		}
        	}
        }
        return ret;
    }

}
