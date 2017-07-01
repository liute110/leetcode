package array;



public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrappingRainWater s = new TrappingRainWater();
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		int re = s.trap(nums);
		System.out.print(re);

	}
	
	
    public int trap(int[] height) {
        if(height.length<=1) return 0;
        int[] maxl = new int[height.length];
        int[] maxr = new int[height.length];
        int res = 0;
        maxl[0] = height[0];
        maxr[maxr.length-1] = height[maxr.length-1];
        for(int i=1; i<maxl.length; i++) {
        	if(height[i] < maxl[i-1]) maxl[i] = maxl[i-1];
        	else maxl[i] = height[i];
        }
        for(int i=maxr.length-2; i>=0; i--) {
        	if(height[i] < maxr[i+1]) maxr[i] = maxr[i+1];
        	else maxr[i] = height[i];
        }
        for(int i=0; i<height.length; i++) {
        	int tmp = Math.min(maxl[i],maxr[i]);
        	if(tmp > height[i])
        		res += (tmp-height[i]);
        }
        return res;
    }
	

}
