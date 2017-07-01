package array;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,2},{1,1}};
		MinimumPathSum mp = new MinimumPathSum();
		System.out.println(mp.minPathSum(nums));
	}
	
    public int minPathSum(int[][] grid) {
    	if(grid.length <= 0 || grid[0].length <= 0) return 0;
    	int m = grid.length - 1;
    	int n = grid[0].length - 1;
    	for(int i=0; i<=m; i++) {
    		for(int j=0; j<=n; j++) {
    			if(i==0 && j==0) continue;
    			else if(i==0 && j!=0) grid[i][j] += grid[i][j-1];
    	    	else if(i!=0 && j==0) grid[i][j] += grid[i-1][j];
    	    	else grid[i][j] +=  Math.min(grid[i-1][j],grid[i][j-1]);
    		}
    	}
        return grid[m][n];
    }
    

}
