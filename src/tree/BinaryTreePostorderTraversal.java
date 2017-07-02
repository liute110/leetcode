package tree;

import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

	public BinaryTreePostorderTraversal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> res = new LinkedList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode cur = root;
    	TreeNode pre = cur;
    	boolean flag = true;
    	while(!stack.isEmpty() || cur!=null) {
    		if(cur!=null && flag) {
    			stack.push(cur);
    			cur = cur.left;
    		}else {
    			if(stack.isEmpty()) return res;
    			cur = stack.peek();
    			if(cur.right!=null && cur.right!=pre) {
    				cur = cur.right;
    				flag = true;
    			}else {
    				cur = stack.pop();
    				res.add(cur.val);
    				flag = false;
    				pre = cur;
    			}
    		}
    	}
    	return res; 
    }

}
