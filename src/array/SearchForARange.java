package array;

public class SearchForARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if(nums==null || nums.length==0)
        	return res;
        int ll = 0;
        int lr = nums.length - 1;
        while(ll<=lr) {
        	int m = (ll+lr)/2;
        	if(nums[m]<target)
        		ll = m + 1;
        	else
        		lr = m -1;
        }
        int rl = 0;
        int rr = nums.length - 1;
        while(rl<=rr) {
        	int m = (rl+rr)/2;
        	if(nums[m]<=target)
        		rl = m + 1;
        	else
        		rr = m - 1;
        }
        
        if(ll<=rr) {
        	res[0] = ll;
        	res[1] = rr;
        }
        return res;
    }
    

}
