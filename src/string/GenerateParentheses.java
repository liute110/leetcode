package string;
import java.util.LinkedList;
import java.util.List;
public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<String> generateParenthesis(int n) {
    	List<String> res = new LinkedList<String>();
    	if(n==0) return res;
    	StringBuilder elem =  new StringBuilder("(");
    	sub(res, elem, 1, 0, n);
    	return res;
    }
    
    public void sub(List<String> res, StringBuilder elem, int left, int right, int n) {
    	if(left==n) {
    		for(int i=0; i<n-right; i++) {
    			elem.append(")");
    		}
			res.add(elem.toString());
			for(int i=0; i<n-right; i++) {
				elem.delete(elem.length()-1,elem.length());
    		}
    	}else {
    		if(right==left) {
    			elem.append("(");
    			sub(res, elem, left+1, right, n);
    			elem.delete(elem.length()-1,elem.length());
    		}else {
    			elem.append("(");
    			sub(res, elem, left+1, right, n);
    			elem.delete(elem.length()-1,elem.length());
    			elem.append(")");
    			sub(res, elem, left, right+1, n);
    			elem.delete(elem.length()-1,elem.length());
    		}
    	}
    }
	

}
