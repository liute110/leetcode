package array;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void sortColors(int[] nums) {
        int len0 = 0,len1 = 0,len2 = 0;
        for(int i:nums){
        	switch (i){
        		case 0: len0 ++;break;
        		case 1:len1 ++;break;
        		case 2:len2 ++;break;
        		default:break;
        	}
        }
        for(int i=0; i<nums.length; i++) {
        	if(i<len0) nums[i] = 0;
        	else if(i<len0+len1) nums[i] = 1;
        	else nums[i] = 2;
        }
    }

}
