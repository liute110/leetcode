package string;

public class DeleteOperationForTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int c[][] = new int[len1+1][len2+1];
        for (int i = 0; i <= len1; i++) {
            for( int j = 0; j <= len2; j++) {
                if(i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    c[i][j] = c[i-1][j-1] + 1;
                } else {
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
            }
        }
        return word1.length() + word2.length() - 2*c[len1][len2];
    }
}
