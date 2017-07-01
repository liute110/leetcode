package array;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	} 
}


public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int prelen = preorder.length - 1;
        int inlen = inorder.length - 1;
        return buildTree(preorder, 0, prelen, inorder, 0, inlen);
    }
    
    public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
    	if(inStart>inEnd || preStart>preEnd) {
    		return null;
    	}
    	int rootVal = pre[preStart];
    	int rootIndex = 0;
    	for(int i=inStart; i<=inEnd; i++) {
    		if(in[i] == rootVal) {
    			rootIndex = i;
    			break;
    		}
    	}
    	
    	int len = rootIndex - inStart;
    	TreeNode root = new TreeNode(rootVal);
    	root.left = buildTree(pre, preStart+1, preStart+len, in, inStart, rootIndex-1);
    	root.right = buildTree(pre, preStart+len+1, preEnd, in, rootIndex+1, inEnd);
    	return root;
    }

}
