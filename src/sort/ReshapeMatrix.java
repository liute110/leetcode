package sort;

public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReshapeMatrix rm = new ReshapeMatrix();
		int[][] nums = {{1,2},{3,4}};
		int[][] result = rm.matrixReshape(nums, 2, 2);
	}
	
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(r*c > nums.length*nums[0].length)
			return nums;
		int[][] result = new int[r][c];
		int[] tmp = new int[r*c];
		int index = 0;
		for(int[] i:nums) {
			for(int j:i) {
				tmp[index] = j;
				index++;
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				result[i][j] = tmp[c*i+j];
			}
		}
		return result;
    }
	

}
