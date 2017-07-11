package string;

public class ReverseStringII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		ReverseStringII rs = new ReverseStringII();
		System.out.println(rs.reverseStr(s, 3));
	}
	
	public String reverseStr(String s, int k) {
		char[] c = s.toCharArray();
		if(c.length<=k) {
			subReverse(c, 0, c.length-1); 
			return new String(c);
		}
		for(int i=0; i<c.length;i++) {
			if((i+1)%k==0 && (i+1)%(2*k)!=0) {
				subReverse(c, i-k+1, i);
			}
		}
		
		int rest = c.length%(2*k);
		if(rest<k) {
			subReverse(c, c.length-rest, c.length-1);
		}
		return new String(c);
		
	}
	
	public void subReverse(char[] c, int m, int n) {
		if(m<0 || n>c.length) return;
		for(int i=m; i<=(m+n)/2; i++){
			char tmp = c[i];
			c[i] = c[m+n-i];
			c[m+n-i] = tmp;
		}
	}	

}
