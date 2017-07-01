package array;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public int findMin(int[] nums) {
        return subFind(nums, 0, nums.length-1);
    }
    
    public int subFind(int[] nums,int low,int high) {
    	if(high-low <= 1)
    		return Math.min(nums[low], nums[high]);
    	int middle = (low + high)/2;
    	if(nums[low] > nums[high]) {
    		if(nums[middle] < nums[middle+1] && nums[middle] < nums[middle-1])
    			return nums[middle];
    		else if(nums[low] > nums[middle])
    			return subFind(nums, low, middle-1);
    		else
    			return subFind(nums, middle+1, high);
    	}
    	return nums[low];
    }

}
