package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.xml.soap.SAAJResult;
public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur!=null) {
        	if(cur!=null) {
        		stack.push(cur);
        		res.add(cur.val);
        		cur = cur.left;	
        	}else {
        		cur = stack.pop();
        		cur = cur.right;
        	}
        }
        return res;
    }

}
