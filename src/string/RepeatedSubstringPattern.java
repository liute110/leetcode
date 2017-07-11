package string;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcabc";
		RepeatedSubstringPattern rs = new RepeatedSubstringPattern();
		rs.repeatedSubstringPattern(s);

	}
	
    public boolean repeatedSubstringPattern(String s) {
    	int n = s.length();
    	int[] next = new int[n];
    	for(int i=1; i<n; i++) {
    		int k= next[i-1];
    		while(s.charAt(i)!=s.charAt(k) && k!=0) {
    			k = next[k-1];
    		}
    		if(s.charAt(i) == s.charAt(k))
    			next[i] = k + 1;
    	}
    	for(int i:next)
    		System.out.println(i);
    	int p = next[s.length()-1];
    	return p > 0 && n%(n-p) == 0;
    }
    

}
