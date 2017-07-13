package string;

public class DistinctSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int numDistinct(String s, String t) {
        int row = s.length();
        int col = t.length();
        if(row<=0 || col<=0)
            return 0;

        int[][] dp = new int[row][col];
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        dp[0][0] = chars[0]==chart[0]?1:0;
        //init first col
        for(int i = 1;i<row;i++){
            dp[i][0] = dp[i-1][0];
            if(chars[i] == chart[0])
                dp[i][0] += 1;
        }
        for(int i = 1;i<row;i++){
            for(int j = 1;j<col;j++){
                dp[i][j] = dp[i-1][j];
                if(chars[i]==chart[j])
                    dp[i][j] += dp[i-1][j-1];
            }
        }
        return dp[row-1][col-1];
    }

}
