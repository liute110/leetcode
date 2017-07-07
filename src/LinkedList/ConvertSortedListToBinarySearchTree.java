package LinkedList;
import java.util.List;

import tree.TreeNode;
public class ConvertSortedListToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode sortedListToBST(ListNode head) {
    	if(head==null) return null;
    	if(head.next==null) return new TreeNode(head.val);
    	ListNode s = head;
    	ListNode mid = s;
    	ListNode f = head;
    	while(f!=null&&f.next!=null) {
    		mid = s;
    		s = s.next;
    		f = f.next.next;
    	}
    	TreeNode root = new TreeNode(s.val);
    	s = mid.next;
    	mid.next = null;
    	root.left = sortedListToBST(head);
    	root.right = sortedListToBST(s);
    	return root;
    }
    


}
