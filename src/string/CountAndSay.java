package string;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String countAndSay(int n) {
        if(n<=0) return "";
        StringBuilder res = new StringBuilder("1");
        if(n==1) return res.toString();
        for(int i=1; i<n; i++) {
        	StringBuilder sd = new StringBuilder();
        	char tmp = res.charAt(0);
        	int c = 0;
        	for(int j=0; j<res.length(); j++) {
        		if(res.charAt(j)==tmp) {
        			c++;
        		}else {
        			sd.append(c+"");
        			sd.append(tmp);
        			tmp = res.charAt(j);
        			c = 1;
        		}
        	}
            sd.append(c+"");
        	sd.append(tmp);
            res = sd;
        }
        return res.toString();
    }
}
