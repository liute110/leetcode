package LinkedList;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeElements(ListNode head, int val) {
    	if(head==null) return head;
    	ListNode res = head;
    	while(head!=null&&head.next!=null) {
    		while(head!=null&&head.next!=null&&head.next.val==val)
    			head.next = head.next.next;
    		head = head.next;
    	}
    	if(res.val==val) res = res.next;
        return res; 
    }

}
