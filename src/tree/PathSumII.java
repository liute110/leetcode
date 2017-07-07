package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null) return res;
        List<Integer> elem = new LinkedList<>();
        sub(root, elem, res, sum);
        return res;
    }
    
    public void sub(TreeNode root, List<Integer> elem, List<List<Integer>> res, int sum) {
    	if(root==null) return;
		if(root.left==null&&root.right==null&&root.val==sum) {
			elem.add(root.val);
			res.add(new LinkedList<>(elem));
			elem.remove(elem.size()-1);
		}
		if(root.left!=null) {
			elem.add(root.val);
			sub(root.left, elem, res, sum-root.val);
			elem.remove(elem.size()-1);
		}
		if(root.right!=null) {
			elem.add(root.val);
			sub(root.right, elem, res, sum-root.val);
			elem.remove(elem.size()-1);
		}
    }
    
    
    

}
