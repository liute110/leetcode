package LinkedList;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

    
    public ListNode getMiddle(ListNode head) {
    	ListNode slow = head;
    	ListNode fast = head;
    	while(fast.next!=null && fast.next.next!=null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow;
    }

    public ListNode merge(ListNode a, ListNode b) {
    	ListNode fake  = new ListNode(-1);
    	ListNode cur = fake;
    	while(a!=null && b!=null) {
    		if(a.val<b.val) {
    			cur.next = a;
    			a = a.next;
    		}else {
    			cur.next = b;
    			b = b.next; 
    		}
    		cur = cur.next;
    	}
    	cur.next = a==null?b:a;
    	return fake.next;
    }
    
    public ListNode sortList(ListNode head) {
    	if(head==null || head.next==null) return head;
    	ListNode mid = getMiddle(head);
    	ListNode right = mid.next;
    	mid.next = null;
    	return merge(sortList(head), sortList(right));
    }
    
}
