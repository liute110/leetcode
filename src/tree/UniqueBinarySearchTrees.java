package tree;

public class UniqueBinarySearchTrees {

	public UniqueBinarySearchTrees() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int numTrees(int n) {
    	int[] res = new int[n+1];
    	res[0] = 1;
    	for(int i=1; i<=n; i++) {
    		for(int j=0; j<i; j++) {
    			res[i] += res[i-j-1]*res[j];
    		}
    	}
    	return res[n];     
    }
    

}
