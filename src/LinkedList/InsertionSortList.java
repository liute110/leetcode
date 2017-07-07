package LinkedList;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(3);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		head.next = l1;
		l1.next = l2;
		InsertionSortList isl = new InsertionSortList();
		ListNode r = isl.insertionSortList(head);
		while(r!=null) {
			System.out.println(r.val);
			r = r.next;
		}

	}
	
    public ListNode insertionSortList(ListNode head) {
    	if(head==null) return null;
    	ListNode newHead = new ListNode(head.val);
    	head = head.next;
    	while(head!=null) {
    		
    		ListNode tmp = newHead;
    		ListNode pre = tmp;
    		ListNode node = new ListNode(head.val);
    		if(head.val<=newHead.val) {
    			node.next = newHead;
    			newHead = node;
    			head = head.next;
    			continue;
    		}
    		while(tmp!=null&&head.val>tmp.val) {
    			pre = tmp;
    			tmp = tmp.next;
    		}
    		//System.out.println(pre.val);
    		pre.next = node;
    		node.next = tmp;
    		head = head.next;
    	}
        return newHead;
    }

}
