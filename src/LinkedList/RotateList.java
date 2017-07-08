package LinkedList;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
        ListNode n1 = new ListNode(2);
        head.next = n1;
        RotateList rl = new RotateList();
        ListNode res = rl.rotateRight(head, 2);
        

	}
	
    public ListNode rotateRight(ListNode head, int k) {
    	if(head==null || k==0 || head.next==null) return head;
    	int len = 0;
    	ListNode p = head;
    	while(p!=null) {
    		len++;
    		p = p.next;
    	}
    	k = k%len;
    	int index = 0;
    	ListNode end = head;
    	while(index<k && end!=null) {
    		end = end.next;
    		index++;
    	}
    	if(index==0) return head;
    	ListNode pre = head;
    	while(end.next!=null) {
    		pre = pre.next;
    		end = end.next;
    	}
    	ListNode res = pre.next;
    	pre.next = null;
    	end.next = head;
    	return res;
    }
    

}
