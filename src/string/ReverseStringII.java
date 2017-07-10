package string;

public class ReverseStringII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		ReverseStringII rs = new ReverseStringII();
		System.out.println(rs.reverseStr(s, 3));

	}
	
    public String reverseStr(String s, int k) {
    	if(s.length()==0 || k==0 || k==1) return s;
    	char[] str = s.toCharArray();
    	for(int i=0; i<s.length(); i++) {
    		if(i==0) continue;
    		if((i+1)%k==0 && (i+1)%(2*k)!=0) {
    			for(int j=((i+1)-k); j<=(i+i-k)/2; j++) {
    				char tmp = str[j];
    				str[j] = str[2*i+1-k-j];
    				str[2*i+1-k-j] = tmp;
    			}
    		}
    	}
    	if(s.length()>(2*k)) {
	    	int rest = s.length()%(2*k);
	    	if(rest<k) {
	    		for(int i=(s.length()-rest); i<(s.length()*2 - rest)/2; i++) {
	    			char tmp = str[i];
					str[i] = str[2*s.length()-1-rest-i];
					str[2*s.length()-1-rest-i] = tmp;
	    		}
	    	}
    	}
    	if(s.length()<k) {
    		for(int i=0; i<s.length()/2; i++) {
    			char tmp = str[i];
				str[i] = str[s.length()-1-i];
				str[s.length()-1-i] = tmp;
    		}
    	}
    	return new String(str);
    }

}
