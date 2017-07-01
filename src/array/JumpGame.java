package array;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame jg = new JumpGame();
		int[] nums = {2,5,0,0};
		System.out.println(jg.canJump(nums));

	}
	
    public boolean canJump(int[] nums) {
        int step = 0;
        for(int i=0; i<nums.length; i++) {
        	step = Math.max(step, nums[i]);
        	if((step+i)>=(nums.length-1)) return true;
        	if(step==0) return false;
        	step--;
        }
        return false;
    }

}
