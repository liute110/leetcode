package LinkedList;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
        ListNode n1 = new ListNode(2);  
        ListNode n2 = new ListNode(2);  
        ListNode n3 = new ListNode(3);  
        ListNode n4 = new ListNode(3);  
        ListNode n5 = new ListNode(4);  
        ListNode n6 = new ListNode(5);  
        head.next = n1;  
        n1.next = n2;  
        n2.next = n3;  
        n3.next = n4;  
        n4.next = n5;  
        n5.next = n6; 

	}
	
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        sub(res, head);
        return res.next;
    }
    
    public void sub(ListNode pre, ListNode cur) {
    	if(cur==null || cur.next==null) {
    		pre.next=cur;
    		return;
    	}
    	if(cur.val==cur.next.val) {
    		ListNode next = cur.next;
    		while(next!=null && next.val==cur.val) {
        		next = next.next;
        	}
    		cur = next;
    		sub(pre, cur);
    	}
    	else {
    		pre.next = cur;
    		sub(cur, cur.next);
    	}
    }


}
