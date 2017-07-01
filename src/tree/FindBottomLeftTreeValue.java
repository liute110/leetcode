package tree;
import tree.TreeNode;
import java.util.Queue;
import java.util.LinkedList;
public class FindBottomLeftTreeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode t1 = new TreeNode(1);
		root.left = t1;
		TreeNode t2 = new TreeNode(2);
		root.right = t2;
		TreeNode t3 = new TreeNode(3);
		t2.left = t3;
		
		FindBottomLeftTreeValue fb = new FindBottomLeftTreeValue();
		System.out.println(fb.findBottomLeftValue(root));

	}
	
    public int findBottomLeftValue(TreeNode root) {
        int res = 0;
        Queue<TreeNode>  que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()) {
        	int n = que.size();
        	for(int i=0; i<n; i++) {
        		TreeNode tmp = que.poll();
        		if(i==0) res= tmp.val;
        		if(tmp.left!=null) que.offer(tmp.left);
        		if(tmp.right!=null) que.offer(tmp.right);
        	}
        }
        return res;
    }
    /*
    public int treeLen(TreeNode root) {
    	if(root==null) return 0;
    	return 1+Math.max(treeLen(root.left), treeLen(root.right));
    }
    */

}
