package array;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		CanPlaceFlowers cp = new CanPlaceFlowers();
		System.out.println(cp.canPlaceFlowers(nums, 0));

	}
	
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    	if(flowerbed.length==1) {
    		if(n==0) return true;
    		if(flowerbed[0]==0&&(n<=1)) return true;
    		return false;
    	}
    	int place = 0;
    	for(int i=0; i<flowerbed.length; i++) {
    		if(i==0) {
    			if(flowerbed[i+1]==0&&flowerbed[i]==0) {
	    			place++;
	    			flowerbed[i] = 1;
    			}
    		}else if(i==(flowerbed.length-1)) {
    			if(flowerbed[i-1]==0&&flowerbed[i]==0) {
	    			place++;
	    			flowerbed[i] = 1;
    			}
    		}else {
    			if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0) {
    				place++;
    				flowerbed[i] = 1;
    			}
    				
    		}
    	}
    	if(place>=n) return true;
    	return false;
    }

}
