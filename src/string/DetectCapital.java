package string;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean detectCapitalUse(String word) {
    	if(word.length()==0 || word.length()==1) return true;
    	if(word.charAt(0)>='a' && word.charAt(0)<='z') {
    		for(int i=1; i<word.length(); i++) {
    			char tmp = word.charAt(i);
    			if(tmp>='A' && tmp<='Z') {
    				return false;
    			}
    		}
    		return true;
    	}
    	boolean res = true;
    	if(word.charAt(0)>='A'  & word.charAt(0)<='Z') {
    		char second = word.charAt(1);
    		boolean flag = true;
    		if(second>='A' && second<='Z') {
    			flag = false;
    		}
    		if(second>='a' && second<='z') {
    			flag = true;
    		}
    		for(int i=2; i<word.length(); i++) {
    			char tmp = word.charAt(i);
    			if(flag==false && tmp>='a' && tmp<='z') {
    				res = false;
    				break;
    			}
    			if(flag==true && tmp>='A' && tmp<='Z') {
    				res = false;
    				break;
    			}
    		}
    		
    	}
    	return res;
        
    }

}
