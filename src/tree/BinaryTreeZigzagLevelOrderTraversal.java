package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new LinkedList<>();
    	if(root==null) return res;
    	boolean  left = true;
    	Queue<TreeNode> que = new LinkedList<>();
    	que.offer(root);
    	while(!que.isEmpty()) {
    		LinkedList<Integer> tmp = new LinkedList<>();
    		int n = que.size();
    		for(int i=0; i<n; i++) {
    			TreeNode node = que.poll();
    			if(left==false)
    				tmp.addFirst(node.val);
    			else
    				tmp.add(node.val);
    			if(node.left!=null) que.offer(node.left);
    			if(node.right!=null) que.offer(node.right);
    		}
    		left = (false==left);
    		res.add(tmp);
    	}
    	return res;
    }

}
