package tree;
import tree.TreeNode;
public class DeleteNodeInABST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		root.right = t2;
		DeleteNodeInABST dn = new DeleteNodeInABST();
		dn.deleteNode(root, 3);

	}
	
    public TreeNode deleteNode(TreeNode root, int key) {
    	if(root==null) return root;
    	if(root.val>key) 
    		root.left = deleteNode(root.left, key);
    	else if(root.val<key)
    		root.right = deleteNode(root.right, key);
    	else {
    		if(root.right==null) {
    			root = root.left;
    		}else if(root.left==null) {	
    			root = root.right;
    		}else {
    			TreeNode node = root.right;
    			TreeNode pre = root;
    			while(node.left!=null) {
    				pre = node;
    				node = node.left;
    			}
    			root.val = node.val;
    			if(pre!=root)
    				pre.left = node.right;
    			else
    				pre.right = node.right;
    		}
    		return root;

    	}
    	return root;
    }

}
