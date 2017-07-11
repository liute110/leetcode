package string;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "11";
		String s2 = "1";
		AddBinary ab = new AddBinary();
		System.out.println(String.valueOf(1+'0'));
		System.out.println(ab.addBinary(s1, s2));
	}
	/*
    public String addBinary(String a, String b) {
        String l = a.length()>b.length()?a:b;
        String s = a.length()<=b.length()?a:b;
        String res = "";
        int c = l.length() - s.length();
        int index = 0;
        for(int i=l.length()-1; i>=c; i--) {
        	int tmp = Character.getNumericValue(l.charAt(i)) + Character.getNumericValue(s.charAt(i-c)) + index;
        	if(tmp>=2) {
        		index = 1;
        		tmp = tmp%2;
        	}else {
        		index = 0;
        	}
        	res = String.valueOf(tmp) + res;
        }
        if(c!=0) {
	    	for(int i=c-1; i>=0; i--) {
	    		int tmp = Character.getNumericValue(l.charAt(i)) + index;
	    		if(tmp>=2) {
	    			index = 1;
	        		tmp = tmp%2;
	        	}else {
	        		index = 0;
	        	}
	    		res = String.valueOf(tmp) + res;
	    	}
        }
    	if(index==1) res = "1" + res;
    	return res; 
    }
    */
	public String addBinary(String a, String b) {
		String res = "";
		int c = 0;
		int i = a.length()-1;
		int j = b.length()-1;
		while(i>=0 || j>=0 || c==1) {
			c += i>=0?a.charAt(i--) - '0':0;
			c += j>=0?b.charAt(j--) - '0':0;
			res = (char)(c%2+'0') + res;
			c = c/2;
		}
		return res;
	}
}
