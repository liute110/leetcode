package tree;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null) return null;
        TreeNode root;
        if(t1==null&&t2!=null) {
        	root = t2;
        }else if(t1!=null&&t2==null) {
        	root = t1;
        }else {
        	root = new TreeNode(t1.val+t2.val);
        	root.left = mergeTrees(t1.left, t2.left);
        	root.right = mergeTrees(t1.right, t2.right);
        }
        return root;
    }
}
