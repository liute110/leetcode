package string;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean repeatedSubstringPattern(String s) {
        int[] prefix = build(s);
        int n = s.length();
        return prefix[n-1]!=0 && n%(n-prefix[n-1])==0;
    }
    
    public int[] build(String s) {
    	int n = s.length();
    	
    }

}
