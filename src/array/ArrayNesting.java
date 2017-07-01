package array;

public class ArrayNesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNesting an = new ArrayNesting();
		int[] nums = {5,4,0,3,1,6,2};
		System.out.println(an.arrayNesting(nums));

	}
	
	public int arrayNesting(int[] nums) {
		int s = 0;
		for(int i=0;i < nums.length;i++) {
			if(nums[i] >= 0) 
				s = Math.max(s, search(nums, i));	
		}
		return s;
    }
	
	
	public int search(int[] nums,int index) {
		int len_s = 0;
		while(nums[index] >= 0) {
			len_s++;
			int next = nums[index];
			nums[index] = -1;
			index = next;
		}
		return len_s;
	}

}
