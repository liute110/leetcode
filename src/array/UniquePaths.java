package array;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePaths(int m, int n) {
		if(m < 1 && n < 1) return 0;
        int[][] res = new int[m][n];
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(i == 0 && j == 0) res[i][j] = 1;
        		else if(i == 0) res[i][j] = res[i][j-1];
        		else if(j == 0) res[i][j] = res[i-1][j];
        		else res[i][j] = res[i-1][j] + res[i][j-1];
        	}
        }
        return res[m-1][n-1];
    }

}
