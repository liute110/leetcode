package array;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] mr = new int[r];
        int[] mc = new int[c];
        for(int i=0; i<r; i++) {
        	for(int j=0; j<c; j++) {
        		if(matrix[i][j]==0) {
        			mr[i] = 0;
        			mc[j] = 0;
        		}
        	}
        }
        for(int i=0; i<r; i++) {
        	if(mr[i] == 0) {
        		for(int j=0; j<c; j++)
        			matrix[i][j] = 0;
        	}
        }
        for(int i=0; i<c; i++) {
        	if(mc[i] == 0) {
        		for(int j=0; j<r; j++)
        			matrix[j][i] = 0;
        	}
        }
        
    }

}
