package string;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    i    nde   x";
		LengthOfLastWord lo = new LengthOfLastWord();
		System.out.println(lo.lengthOfLastWord(s));
	}
	
    public int lengthOfLastWord(String s) {
        int sindex = -1;
        int len = s.length();
        if(len==0) return 0;
        int eindex = 0;
        for(int i=len-1; i>=0; i--) {
        	if(s.charAt(i)!=' ') {
        		eindex = i;
        		break;
        	}
        }
        int tmp = -1;
        while(tmp<eindex) {
        	if(s.charAt(tmp+1)==' ' && tmp<eindex) {
        		sindex = tmp+1;
        	}
        	tmp += 1;	
        }
        
        return eindex - sindex;
    }

}
