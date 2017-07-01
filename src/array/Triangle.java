package array;
import java.util.List;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() < 1)
        	return 0;
        int[][] minSum = new int[triangle.size()][];
        for(int i=0; i<minSum.length; i++) {
        	minSum[i] = new int[i+1];
        }
        minSum[0][0] = triangle.get(0).get(0);
        for(int i=1; i<minSum.length; i++) {
        	List<Integer> line = triangle.get(i);
        	for(int j=0; j<minSum[i].length; j++) {
        		if(j == 0) {
        			minSum[i][0] = line.get(0) + minSum[i-1][0];
        		}else if(i == j) {
        			minSum[i][j] = line.get(j) + minSum[i-1][j-1];
        		}else if(i > j) {
        			minSum[i][j] = line.get(j) + Math.min(minSum[i-1][j], minSum[i-1][j-1]);
        		}
        	}
        }
        
        int min = minSum[minSum.length-1][0];
        int length = minSum[minSum.length-1].length;
        for(int i=1; i<length; i++) {
        	if(min > minSum[length-1][i])
        		min = minSum[length-1][i];
        }
        return min;
        
    }

}
