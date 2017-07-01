package array;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxArea(int[] height) {
    	if(height.length<2) return 0;
        int low = 0;
        int high = height.length - 1;
        int cur = 0;
        int max = 0;
        while(low < high) {
        	cur = (high-low)*Math.min(height[low],height[high]);
        	max = Math.max(max, cur);
        	if(height[low] < height[high]) {
        		int k = low;
        		while(k < high && height[k] <= height[low]) {
        			k++;
        		}
        		low = k;
        	}
        	else {
        		int k = high;
        		while(k>low && height[k]<=height[high]) 
        			k--;
        		high = k;
        	}
        	
        }
        return max;
    }

}
