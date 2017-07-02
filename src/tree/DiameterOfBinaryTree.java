package tree;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		
		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		
		DiameterOfBinaryTree bt = new DiameterOfBinaryTree();
		System.out.println(bt.diameterOfBinaryTree(root));

	}
	
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh+rh,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
    
    public int getHeight(TreeNode root) {
    	if(root==null) return 0;
    	return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }

}
