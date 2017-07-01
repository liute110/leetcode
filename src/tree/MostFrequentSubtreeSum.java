package tree;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue; 
import java.util.Map;
import tree.TreeNode;
public class MostFrequentSubtreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] findFrequentTreeSum(TreeNode root) {
    	int[] res = {};
    	if(root==null) return res;
        sub(root);
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        que.offer(root);
        while(!que.isEmpty()) {
        	TreeNode node = que.poll();
        	if(map.containsKey(node.val)) map.put(node.val, map.get(node.val)+1);
        	else map.put(node.val, 1);
        	if(node.left!=null) que.offer(node.left);
        	if(node.right!=null) que.offer(node.right);
        }
        List<Integer> lr = new LinkedList<Integer>();
        int tmp = 0;
        for(int k:map.keySet()) {
        	if(lr.size()==0) {
        		tmp = map.get(k);
        		lr.add(k);
        	}else if(map.get(k)>tmp) {
        		lr.clear();
        		lr.add(k);
        		tmp = map.get(k);
        	}else if(map.get(k)==tmp) {
        		lr.add(k);
        	}
        }
        res  =  new int[lr.size()];
        for(int i=0; i<lr.size(); i++) {
        	res[i] = lr.get(i);
        }
    	return res;
    }
    
    public int sub(TreeNode root) {
    	if(root==null) return 0;
    	if(root.left!=null) root.val += sub(root.left);
    	if(root.right!=null) root.val += sub(root.right);
    	return root.val;
    }

}
