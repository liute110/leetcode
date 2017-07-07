package LinkedList;

public class ReverseNodesInkGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

	}
	
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        if(head==null) return head;
        int index = 1;
        ListNode end = head;
        while(index<k && end!=null) {
        	end = end.next;
        	index++;
        }
        if(end!=null && end.next!=null) {
        	ListNode tmp = end.next;
        	end.next = null;
        	ListNode node = reverse(head);
        	head.next = reverseKGroup(tmp, k);
        	return node;
        }
        if(end==null) return head;
        return reverse(head);
    }
	
	
	public ListNode reverse(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode pre = head;
		ListNode cur = pre.next;
		pre.next = null;
		ListNode next = null;
		while(cur!=null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}

}
	