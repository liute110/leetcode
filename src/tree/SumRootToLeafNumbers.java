package tree;

public class SumRootToLeafNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(3);
		root.left = t1;
		SumRootToLeafNumbers sl = new SumRootToLeafNumbers();
		System.out.println(sl.sumNumbers(root));

	}
	
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        int res = sub(root, 0);
        return res;
    }
    
    public int sub(TreeNode root, int sum) {
    	if(root==null) return sum;
    	int cursum = sum*10 + root.val;
    	if(root.left==null&&root.right==null) return cursum;
    	int res = 0;
    	if(root.left!=null) res += sub(root.left, cursum);
    	if(root.right!=null) res += sub(root.right, cursum);
    	return res;
    }
    

}
