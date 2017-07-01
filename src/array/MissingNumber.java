package array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int missingNumber(int[] nums) {
        int sum_nums = 0;
        for(int i:nums)
        	sum_nums += i;
        return (nums.length+1)*nums.length/2 - sum_nums;
    }

}
