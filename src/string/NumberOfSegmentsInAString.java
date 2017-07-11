package string;

public class NumberOfSegmentsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc ";
		NumberOfSegmentsInAString no = new NumberOfSegmentsInAString();
		System.out.println(no.countSegments(s));
	}
	
    public int countSegments(String s) {
    	if(s.length()==0) return 0;
    	int res = 0;
    	int pre = 1;
    	for(int i=0; i<s.length(); i++) {
    		if(pre!=1 && s.charAt(i)==' ') {
    			res++;
    			pre = 1;
    		}
    		if(pre==1 && s.charAt(i)!=' ') {
    			pre = 0;
    		}
    	}
    	if(s.charAt(s.length()-1)!=' ') return res+1;
    	return res; 
    }

}
