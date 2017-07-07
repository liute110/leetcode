package tree;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean hasPathSum(TreeNode root, int sum) {
    	boolean res = false;
    	if(root==null) return res;
    	if(root.left==null&&root.right==null) {
    		if(root.val==sum) res = true;
    	}else {
    		res = hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    	}
    	return res;
    }

}
