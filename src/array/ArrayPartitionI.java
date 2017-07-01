package array;
import sort.QuickSort;

public class ArrayPartitionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPartitionI ap = new ArrayPartitionI();
		int result = 0; 
		int[] nums = {1,4,3,2};
		result = ap.arrayPairSum(nums);
		System.out.println(result);
		
	}
	
	public int arrayPairSum(int[] nums) {
        	QuickSort qs = new QuickSort();
        	qs.quickSort(nums, 0, nums.length-1);
        	int result = 0;
        	for(int i=0;i<nums.length;i++) {
        		if(i%2 == 0) {
        			//System.out.println(nums[i]);
        			result += nums[i];
        		}
        	}
        	return result;
	}
	

}
