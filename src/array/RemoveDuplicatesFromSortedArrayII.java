package array;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedArrayII rd = new RemoveDuplicatesFromSortedArrayII();
		int[] nums = {1,1,1,1,2,2,2,3};
		rd.removeDuplicates(nums);

	}
	
    public int removeDuplicates(int[] nums) {
    	if(nums.length<=0) return 0;
        int index = 0;
        boolean isRepeated = false;
        for(int i=1; i<nums.length; i++) {
        	if(nums[i] != nums[index]) {
        		isRepeated = false;
        		index++;
        		nums[index] = nums[i];
        	}else {
        		if(isRepeated==false) {
        			index++;
        			nums[index] = nums[i];
        			isRepeated  = true;
        		}
        	}
        }
        for(int i:nums)
        	System.out.println(i);
        return index + 1;
    }

}
