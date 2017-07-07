package LinkedList;



public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode partition(ListNode head, int x) {
    	ListNode greater = new ListNode(0);
    	ListNode smaller = new ListNode(0);
    	ListNode gp = greater;
    	ListNode sp = smaller;
    	while(head!=null) {
    		ListNode next = head.next;
    		if(head.val>=x) {
    			gp.next = head;
    			gp = gp.next;
    		}else{
    			sp.next = head;
    			sp = sp.next;
    		}
    		head.next = null;
    		head = next;
    	}
    	sp.next = greater.next;
    	return smaller.next;
    }

}
