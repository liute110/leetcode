package array;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheDuplicateNumber fdn = new FindTheDuplicateNumber();
		int[] nums = {1,1};
		System.out.println(fdn.findDuplicate(nums));
		

	}
	
    public int findDuplicate(int[] nums) {
        int res = -1;
        for(int i=0;i<nums.length;i++) {
        	if(nums[Math.abs(nums[i])] < 0)
        		return Math.abs(nums[i]);
        	nums[Math.abs(nums[i])] *= -1;
        }
        return res;
    }

}
