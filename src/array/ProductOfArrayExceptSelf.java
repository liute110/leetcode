package array;


public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfArrayExceptSelf pa = new ProductOfArrayExceptSelf();
		int[] nums = {1,2,3,4};
		for(int i:pa.productExceptSelf(nums)) {
			System.out.println(i);
		}
	}
	
	
	
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int pre = 1;
		for(int i=0;i < nums.length;i++) {
			result[i] = pre;
			pre *= nums[i];
		}
		pre = 1;
		for(int i = nums.length-1;i >= 0;i--) {
			result[i] *= pre;
			pre *= nums[i];
		}
		return result;
		
    }

}
