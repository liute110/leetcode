package array;

public class SearchInRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInRotatedSortedArrayII ai = new SearchInRotatedSortedArrayII();
		int[] nums = {4 ,4,5, 6 ,7 ,0 ,1 ,2,2};
		System.out.println(ai.search(nums, 0));

	}

    public boolean search(int[] nums, int target) {
    	int low = 0;
    	int high = nums.length-1;
    	while(low<=high) {
    		int mid = (low+high)/2;
    		System.out.println(mid);
    		if(nums[mid]==target) {
    			return true;
    		}
    		if(nums[mid]>nums[low]) {
    			if(target<nums[mid]&&target>=nums[low])
    				high = mid-1;
    			else 
    				low = mid + 1;
    		}else if(nums[mid]<nums[low]){
    			if(target>nums[mid]&&target<=nums[high]) 
    				low = mid + 1;
    			else
    				high = mid -1;
    		}else
    			low++;
    	}
        return false;
    }
}
