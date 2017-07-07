package LinkedList;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(true) {
        	if(fast==null || fast.next==null)
        		return null;
        	slow = slow.next;
        	fast = fast.next.next;
        	if(fast==slow)
        		break;
        }
        
        slow = head;
        while(slow!=fast) {
        	slow = slow.next;
        	fast = fast.next;
        }
        return slow;
    }

}
