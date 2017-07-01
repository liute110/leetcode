package tree;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeTilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findTilt(TreeNode root) {
        int res = 0;
        if(root==null) return res;
        sub(root);
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()) {
        	TreeNode node = que.poll();
        	int lv = 0;
        	int rv = 0;
        	if(node.left!=null) lv = node.left.val;
        	if(node.right!=null) rv = node.right.val;
        	res += Math.abs(lv-rv);
        	if(node.left!=null) que.offer(node.left);
        	if(node.right!=null) que.offer(node.right);
        }
        return res;
    }
    
    public int sub(TreeNode root) {
    	if(root==null) return 0;
    	root.val += sub(root.left) + sub(root.right);
    	return root.val;
    }

}
