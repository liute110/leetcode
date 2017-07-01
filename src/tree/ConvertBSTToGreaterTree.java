package tree;
import tree.TreeNode;
public class ConvertBSTToGreaterTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int sum = 0;  
	
    public TreeNode convertBST(TreeNode root) {
    	search(root);
    	return root;
    }
    
    public void search(TreeNode root) {
    	if(root!=null) {
	    	search(root.right);
	    	root.val += sum;
	    	sum = root.val;
	    	search(root.left);
    	}
    }
}
