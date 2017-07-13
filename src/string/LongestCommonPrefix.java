package string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length<=0) return "";
    	int len = strs[0].length();
    	for(int i=0; i< strs.length; i++) {
    		if(strs[i].length()<len) 
    			len = strs[i].length();
    	}
    	StringBuilder sd = new StringBuilder("");
    	for(int i=0; i<len; i++) {
    		char c = strs[0].charAt(i);
    		int j=0;
    		for(; j<strs.length; j++) {
    			if(strs[j].charAt(i)!=c)
    				break;
    		}
    		if(j==strs.length)
    			sd.append(c);
    		else
    			break;
    	}
    	return sd.toString();
    }

}
