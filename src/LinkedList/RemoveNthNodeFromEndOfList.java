package LinkedList;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        for(int i=0; i<n; i++) {
        	end = end.next;
        }
        ListNode cur = head;
        if(end==null) return head.next;
        while(end.next!=null) {
        	cur = cur.next;
        	end = end.next;
        }
        cur.next = cur.next.next;
        return head;
    }

}
