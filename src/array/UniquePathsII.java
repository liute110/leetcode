package array;

public class UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePathsII up =new UniquePathsII();
		int[][] nums = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(up.uniquePathsWithObstacles(nums));

	}
	
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if(obstacleGrid.length==0 || obstacleGrid[0].length==0)
    		return 0;
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	int[][] tmp = new int[m][n];
    	for(int i=0; i<m; i++) {
    		for(int j=0; j<n; j++) {
    			tmp[i][j] = 0;
    			if(i==0 && j==0) {
    				if(obstacleGrid[i][j]==0) tmp[i][j] = 1;
    			}else if(i!=0 && j==0) {
    				if(obstacleGrid[i][j]==0&&tmp[i-1][j]!=0) tmp[i][j] += tmp[i-1][j] ;
    			}else if(i==0 && j!=0) {
    				if(obstacleGrid[i][j]==0&&tmp[i][j-1]!=0) tmp[i][j] = tmp[i][j-1];
    			}else {
    				if(obstacleGrid[i][j]==0&&tmp[i-1][j]!=0) tmp[i][j] += tmp[i-1][j];
    				if(obstacleGrid[i][j]==0&&tmp[i][j-1]!=0) tmp[i][j] += tmp[i][j-1];
    			}
    		}
    	}
    	
    	return tmp[m-1][n-1];
    }
    


}
