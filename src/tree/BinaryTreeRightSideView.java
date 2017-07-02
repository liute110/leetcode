package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BinaryTreeRightSideView {

	public BinaryTreeRightSideView() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root==null) return res;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()) {
        	int n = que.size();
        	int index = 1;
        	for(int i=0; i<n; i++) {
        		if(i==0) res.add(que.peek().val);
        		TreeNode node = que.poll();
        		if(node.right!=null) que.offer(node.right);
        		if(node.left!=null) que.offer(node.left);
        	}
        }
        return res;
    }

}
