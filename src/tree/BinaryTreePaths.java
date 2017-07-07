package tree;

import java.util.LinkedList;
import java.util.List;
public class BinaryTreePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(4);
		t1.right = t2;
		t2.left = t3;
		
		BinaryTreePaths pt = new BinaryTreePaths();
		for(String s:pt.binaryTreePaths(t1))
			System.out.println(s);
	}
	
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<String>();
        if(root==null) return res;
        search(root,root.val+"", res);
        return res;
    }
    
    public void search(TreeNode root, String pre, List<String> res) {
    	
    	if(root.left!=null) search(root.left, pre+"->"+root.left.val, res);
    	if(root.right!=null) search(root.right, pre+"->"+root.right.val, res);
    	if(root.left==null&root.right==null) res.add(pre);
    	return;
    }

}
