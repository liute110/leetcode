package array;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int searchInsert(int[] nums, int target) {
        return subSearch(nums, target, 0, nums.length-1);
    }
    
    public int subSearch(int[] nums,int target,int low,int high) {
    	int res = -1;
    	int middle = (low + high)/2;
    	if(nums[middle] == target) res = middle;
    	if(target < nums[middle]) {
    		if(middle == 0) res = 0;
    		else if(target > nums[middle-1]) res = middle;
    		else res = subSearch(nums, target, low, middle-1);
    	}
    	else if(target > nums[middle]) {
    		if(middle == nums.length-1) res = nums.length;
    		else if(target < nums[middle+1]) res = middle + 1;
    		else res = subSearch(nums, target, middle+1, high);
    	}
    	return res;
    }

}
