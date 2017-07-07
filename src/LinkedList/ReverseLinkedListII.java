package LinkedList;


public class ReverseLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		head.next = l1;
		l1.next = l2;
		ReverseLinkedListII rl = new ReverseLinkedListII();
		rl.reverseBetween(head, 1, 3);
	}
	
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(m==n || head.next==null) return head;
    	int index = 1;
    	ListNode point = head;
    	ListNode preS = null;
    	ListNode np = null;
    	while(point!=null) {
    		if(index==(m-1)) {
    			preS = point;
    			
    		}
    		if(index==n) {
    			np = point;
    			break;
    		}
            point = point.next;
            index++;
    	}
    	ListNode s = null;
    	ListNode tmp = null;
    	ListNode next = np.next;
    	np.next = null;
    	if(preS==null) {
    		tmp = reverse(head);
    		head.next = next;
    		return tmp;
    	}
    	s = preS.next;
    	preS.next = null;
    	tmp = reverse(s);
    	preS.next = tmp;
    	s.next = next;
    	return head;
    }
    
    private ListNode reverse(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
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
