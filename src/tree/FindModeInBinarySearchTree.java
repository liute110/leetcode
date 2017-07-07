package tree;

import java.util.Stack;
import java.util.LinkedList;
import java.util.List;
public class FindModeInBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(4);
		t1.right = t2;
		t2.left = t3;
		FindModeInBinarySearchTree fm  = new FindModeInBinarySearchTree();
		//System.out.println("###########");
		for(int i:fm.findMode(t1)) 
			System.out.println(i);
		
	}
	
    public int[] findMode(TreeNode root) {
    	if(root==null) return new int[] {};
    	List<Integer> resList = new LinkedList<Integer>();
    	int maxval = root.val;
    	int maxlen = 0;
    	int curval = root.val;
    	int curlen = 0;
    	resList.add(curval);
    	TreeNode curnode = root;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(!stack.isEmpty() || curnode!=null) {
    		if(curnode!=null) {
    			stack.push(curnode);
    			curnode = curnode.left;
    		}else {
    			TreeNode tmp = stack.peek();
    			if(tmp.val==curval) curlen += 1;
    			if(tmp.val!=curval) {
    				if(curlen>maxlen) {
    					maxlen = curlen;
    					maxval = curval;
    					resList.clear();
    					resList.add(maxval);
    				}else if(curlen==maxlen) {
    					resList.add(curval);
    				}
    				curlen= 1;
    			}
    			tmp = stack.pop();
    			curval = tmp.val;
    			curnode = tmp.right;
    		}
    	}
    	if(curval!=maxval) {
    		if(curlen>maxlen) {
    			resList.clear();
    			resList.add(curval);
    		}
    		if(curlen==maxlen) {
    			resList.add(curval);
    		}
    		
    	}
    	int[] res = new int[resList.size()];
    	for(int i=0; i<resList.size(); i++) {
    		res[i] = resList.get(i);
    	}
        
    	return res;
    }

}
