package tree;

public class ConstructStringFromBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String tree2str(TreeNode t) {
        String res = "";
        if(t==null) return res;
        res += t.val;
        if(t.left!=null) res += "(" + tree2str(t.left) + ")";
        if(t.right!=null) {
        	if(t.left==null)
        		res += "()";
        	res += "(" + tree2str(t.right) + ")";
        }
        return res;
    }

}
