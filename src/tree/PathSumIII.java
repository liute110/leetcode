package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumIII {

	public PathSumIII() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(-2);
		TreeNode t3 = new TreeNode(-3);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(3);
		TreeNode t6 = new TreeNode(-2);
		TreeNode t7 = new TreeNode(-1);
		//TreeNode t8 = new TreeNode(-2);
		//TreeNode t9 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t4.left = t7;
		//t4.right = t8;
		//t5.right = t9;
		PathSumIII ps = new PathSumIII();
		int res = ps.pathSum(t1, -1);
		System.out.println(res);

	}
	
    public int pathSum(TreeNode root, int sum) {
        int res = 0;
        if(root==null) return res;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
        	int n = que.size();
        	for(int i=0; i<n; i++) {
        		TreeNode node = que.poll();
        		res += sub(node,sum);
        		if(node.left!=null) que.offer(node.left);
        		if(node.right!=null) que.offer(node.right);
        	}
        }
        return res;
    }
    
    public int sub(TreeNode root, int sum) {
    	int res = 0;
    	if(root==null) return 0;
    	if(root.val==sum) res += 1;
    	if(root.left!=null) res += sub(root.left,sum-root.val);
    	if(root.right!=null) res += sub(root.right, sum-root.val);
    	return res;
    }

}
