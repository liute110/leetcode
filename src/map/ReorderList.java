package map;

import LinkedList.ListNode;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
        ListNode n1 = new ListNode(2);  
        ListNode n2 = new ListNode(3);  
        ListNode n3 = new ListNode(4);  
        ListNode n4 = new ListNode(5);  
        ListNode n5 = new ListNode(6);  
        ListNode n6 = new ListNode(7);  
        head.next = n1;  
        n1.next = n2;  
        n2.next = n3;  
        n3.next = n4;  
        n4.next = n5;  
        n5.next = n6; 
        
        ReorderList rl = new ReorderList();
        rl.reorderList(head);
        while(head!=null) {
        	System.out.println(head.val);
        	head = head.next;
        }

	}
	
    public void reorderList(ListNode head) {
    	if(head==null || head.next==null) return;
    	ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null;
        right = reverse(right);
        mid = head;
        ListNode tmp = null;
        while(right!=null) {
        	tmp = mid.next;
        	mid.next = right;
        	right = right.next;
        	mid = mid.next;
        	mid.next = tmp;
        	mid = mid.next;
        }
    }
    
    
    public ListNode reverse(ListNode head) {
    	if(head==null || head.next==null) return head;
    	ListNode pre = head;
    	ListNode cur = pre.next;
    	pre.next = null;
    	ListNode tmp = null;
    	while(cur!=null) {
    		tmp = cur.next;
    		cur.next = pre;
    		pre = cur;
    		cur = tmp;
    	}
    	
    	return pre;
    }
    
    public ListNode getMiddle(ListNode head) {
    	if(head==null || head.next==null) return head;
    	ListNode fast = head;
    	ListNode slow = head;
    	while(fast.next!=null && fast.next.next!=null) {
    		 slow = slow.next;
    		 fast = fast.next.next;
    	}
    	return slow;
    }
	

}
