package array;

public class FindMinimumInRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimumInRotatedSortedArrayII fm = new FindMinimumInRotatedSortedArrayII();
		int[] nums = {4,5,6,7,1,2};
		System.out.println(fm.findMin(nums));
	}
	
    public int findMin(int[] nums) {
        return subFin(nums, 0, nums.length-1);
    }
    
    public int subFin(int[] nums, int low, int high) {
    	if(low == high) return nums[low];
    	int mid = (low + high)/2;
    	if(nums[high] > nums[mid]) {
    		return subFin(nums, low, mid);
    	}
    	else if(nums[high] == nums[mid]) {
    		return subFin(nums, low, high-1);
    	}
    	else {
    		return subFin(nums, mid+1, high);
    	}
    			
    }

}
