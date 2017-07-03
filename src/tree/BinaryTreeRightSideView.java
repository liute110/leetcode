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
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(-3);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(2);
		TreeNode t6 = new TreeNode(11);
		TreeNode t7 = new TreeNode(3);
		TreeNode t8 = new TreeNode(-2);
		TreeNode t9 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		t4.left = t7;
		t4.right = t8;
		t5.right = t9;
		BinaryTreeRightSideView ps = new BinaryTreeRightSideView();
		ps.rightSideView(t1);
		//System.out.println(res);
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
