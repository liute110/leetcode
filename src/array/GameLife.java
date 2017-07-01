package array;

public class GameLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;
        int m = board.length;
        int n = board[0].length;
        //d>d:0 l>l:1 l>d:2 d>l:3
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		int count = getLive(board, i, j);
        		if(board[i][j]==0 && count==3) {
        			board[i][j] = 3;
        		}
        		else if(board[i][j]==1 && (count<2 || count>3)) {
        			board[i][j] = 2;
        		}
        	}
        }
        
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		board[i][j] = board[i][j]%2;
        	}
        }
        
    }
    
    public int getLive(int[][] board, int i, int j) {
    	int count = 0;
    	for(int x = i-1; x<=i+1; x++) {
    		for(int y=j-1; y<=j+1; y++) {
    			if(x<0 || x>=board.length || y<0 || y>=board[0].length || (x==i && y==j)) {
    				continue;
    			}
    			if(board[x][y] == 1 || board[x][y] == 2) {
    				count++;
    			}
    		}
    	}
    	return count;
    }

}
