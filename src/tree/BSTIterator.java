package tree;

import java.util.Stack;

public class BSTIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	private Stack<TreeNode> stack = new Stack<TreeNode>();
	
    public BSTIterator(TreeNode root) {
        if(root!=null) {
        	pushleft(root);
        }
    }
    
    public void pushleft(TreeNode root) {
    	TreeNode node = root;
    	while(node!=null) {
    		stack.push(node);
    		node = node.left;
    	}
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(!stack.isEmpty()) return true;
        return false;
    }

    /** @return the next smallest number */
    public int next() {
    	TreeNode top = stack.pop();
    	if(top.right!=null) pushleft(top.right);
    	return top.val;
    }
}
