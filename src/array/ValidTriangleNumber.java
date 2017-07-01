package array;

import java.util.Arrays;

public class ValidTriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidTriangleNumber vt = new ValidTriangleNumber();
		int[] nums = {2,2,3,4};
		System.out.println(vt.triangleNumber(nums));

	}
	
	
    public int triangleNumber(int[] nums) {
    	if(nums.length<=2) return 0;
    	int ans = 0;
    	Arrays.sort(nums);
    	int size = nums.length;
    	for(int i=0; i<size-2; i++) {
    		if(nums[i]==0) continue;
    		int k = i+2;
    		for(int j=i+1; j<size-1; j++) {
    			while(k < size && nums[k] < nums[i] + nums[j]) k++;
    			ans += k-j-1;
    		}
    	}
    	return ans;
    }
    
    

}
