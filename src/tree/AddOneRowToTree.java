package tree;

import java.util.LinkedList;
import java.util.Queue;
public class AddOneRowToTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode addOneRow(TreeNode root, int v, int d) {
    	if(d==1) {
    		TreeNode node = new TreeNode(v);
    		node.left = root;
    		return node;
    	}
    	Queue<TreeNode> que = new LinkedList<TreeNode>();
    	que.offer(root);
    	int index  = 1;
    	while(!que.isEmpty()) {
    		int n = que.size();
    		if(index!=d-1) {
    			for(int i=0; i<n; i++) {
	    			TreeNode node = que.poll();
	    			if(node.left!=null) que.offer(node.left);
	    			if(node.right!=null) que.offer(node.right);
	    		}
    			index++;
    			continue;
    		}
    		else if(index==d-1){
	    		for(int i=0; i<n; i++) {
	    			TreeNode node = que.poll();
    				TreeNode newnl = new TreeNode(v);
    				newnl.left = node.left;
    				newnl.right = null;
    				node.left = newnl;
    				TreeNode newnr = new TreeNode(v);
    				newnr.right = node.right;
    				newnr.left = null;
    				node.right = newnr;
	    		}
	    		break;
    		}
    		
    	}
    	return root;
    }

}
