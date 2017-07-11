package string;

import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isValid(String s) {
	    Map<Character, Character> map = new HashMap<>();
	    map.put(')','(');
	    map.put(']','[');
	    map.put('}','{');
	    Stack<Character> stack = new Stack<Character>();
	    for(int i=0; i<s.length(); i++) {
	    	char key = s.charAt(i);
	    	if(stack.size()==0) {
	    		if(key=='}' || key==']' || key==')') return false;
	    		stack.push(key);
	    		continue;
	    	}
	    	if(key=='{' || key=='[' || key=='(') {
	    		stack.push(key);
	    	}
	    	else {
	    		if(map.get(key)!=stack.peek()) {
	        		return false;
	        	}
	    		stack.pop();
	    	}
	    }
	    if(stack.size()!=0) return false;
	    return true;
    }

}
