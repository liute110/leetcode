package tree;
import java.util.Stack;
public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void flatten(TreeNode root) {
    	TreeNode pre = null;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode cur = root;
    	while(!stack.isEmpty() || cur!=null) {
    		if(cur!=null) {
    			if(pre==null) {
    				pre = cur;
                    if(cur.right!=null) stack.push(cur.right);
                    cur = cur.left;
                    pre.left = null;
    			}else {
                    if(cur.right!=null) stack.push(cur.right);
    				pre.right = cur;
                    pre = cur;
                    cur = cur.left;
                    pre.left = null;
    			}
    			
    		}else {
				TreeNode node = stack.pop();
				cur = node;
			}
    	}
    }

}
