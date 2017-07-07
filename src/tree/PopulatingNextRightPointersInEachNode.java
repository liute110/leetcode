package tree;


class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class PopulatingNextRightPointersInEachNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void connect(TreeLinkNode root) {
    	if(root==null) return;
    	TreeLinkNode cur;
    	while(root.left!=null) {
    		cur = root;
    		while(cur!=null) {
    			cur.left.next = cur.right;
    			if(cur.next!=null)
    				cur.right.next = cur.next.left;
    			cur = cur.next;
    		}
    		root = root.left;
    	}
    	
    }

}
