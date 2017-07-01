package tree;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeInorderTraversal bt = new BinaryTreeInorderTraversal();
		TreeNode root = new TreeNode(0);
		TreeNode t2 = new TreeNode(2);
		root.right = t2;
		TreeNode t3 = new TreeNode(3);
		t2.left = t3;
		for(int i:bt.inorderTraversal(root))
			System.out.print(i);

	}
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new LinkedList<Integer>();
    	if(root==null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curn = root;
        while(!stack.isEmpty()||curn!=null) {
        	if(curn!=null) {
        		stack.push(curn);
        		curn = curn.left;
        	}else {
        		curn = stack.pop();
        		res.add(curn.val);
        		curn = curn.right;
        	}
        }

        return res;
    }

}
