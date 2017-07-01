package tree;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tree.TreeNode;
public class FindLargestValueInEachTreeRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode t1 = new TreeNode(1);
		root.left = t1;
		TreeNode t2 = new TreeNode(2);
		root.right = t2;
		TreeNode t3 = new TreeNode(3);
		t2.left = t3;
		
		FindLargestValueInEachTreeRow fl = new FindLargestValueInEachTreeRow();
		for(Integer s:fl.largestValues(root))
			System.out.println(s);

	}
	
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()) {
        	int n = que.size();
        	int max = que.element().val;
        	//que.poll();
        	for(int i=0; i<n; i++) {
        		TreeNode tmp = que.poll();
        		max = Math.max(max, tmp.val);
        		if(tmp.left!=null) que.offer(tmp.left);
        		if(tmp.right!=null) que.offer(tmp.right);
        	}
        	res.add(max);
        }
        return res;
    }

}
