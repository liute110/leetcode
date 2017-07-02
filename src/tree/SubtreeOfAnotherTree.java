package tree;

public class SubtreeOfAnotherTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    StringBuilder spre = new StringBuilder();
    StringBuilder tpre = new StringBuilder();
    public boolean isSubtree(TreeNode s, TreeNode t) {
        preOrder(s, spre.append(","));
        preOrder(t, tpre.append(","));
        System.out.println(spre.toString());
        System.out.println(tpre.toString());
        return spre.toString().contains(tpre.toString());
    }
    public void preOrder(TreeNode root, StringBuilder str){
        if(root == null){
            str.append("#,");
            return;
        }
        str.append(root.val).append(",");
        preOrder(root.left, str);
        preOrder(root.right, str);
    }
}
