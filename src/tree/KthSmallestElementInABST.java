package tree;
import java.util.Stack;
public class KthSmallestElementInABST {
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(2);
		TreeNode l = new TreeNode(1);
		TreeNode r = new TreeNode(3);
		root.right = r;
		root.left = l;
		KthSmallestElementInABST ks = new KthSmallestElementInABST();
		System.out.println(ks.kthSmallest(root, 3));
	}
	
    public int kthSmallest(TreeNode root, int k) {
        //采用中序遍历
        int index = 0;
        Stack<TreeNode> que = new Stack<TreeNode>();
        TreeNode cur = root;
        while(!que.isEmpty() || cur!= null) {
        	if(cur!=null) {
        		que.push(cur);
        		cur = cur.left;
        	}else { 
        		cur = que.pop();
        		index++;
        		if(index==k)
        			return cur.val;
        		cur = cur.right;
        	}
        }
        return 0;
    }

}
