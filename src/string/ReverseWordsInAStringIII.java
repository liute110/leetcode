package string;

public class ReverseWordsInAStringIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        boolean isFirst = true;
        for(String w:words) {
        	StringBuilder tmp = new StringBuilder(w);
        	w = tmp.reverse().toString();
        	if(isFirst) {
        		res.append(w);
        		isFirst = false;
        	}else {
        		res.append(" " + w);
        	}
        }
        return res.toString();
    }

}
