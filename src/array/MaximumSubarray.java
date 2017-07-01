package array;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxSubArray(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return 0;
    	int g_max = nums[0];
    	int l_max = nums[0];
    	for(int i=1; i<nums.length; i++) {
    		l_max = Math.max(nums[i], l_max + nums[i]);
    		g_max = Math.max(l_max,g_max);
    	}
    	return g_max;
        
    }

}
