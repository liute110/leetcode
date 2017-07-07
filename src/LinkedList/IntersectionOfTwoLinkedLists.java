package LinkedList;
public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode res = null;
    	if(headA==null || headB==null) return res;
        int a = 0;
        int b = 0;
        ListNode point = headA;
        while(point!=null) {
        	a++;
        	point = point.next;
        }
        point = headB;
        while(point!=null) {
        	b++;
        	point = point.next;
        }
        int len = 0;
        if(a>b) {
        	len = a - b;
        	while(len>0&&headA!=null) {
        		headA = headA.next;
        		len--;
        	}
        }else {
        	len = b - a;
        	while(len>0&&headB!=null) {
        		headB = headB.next;
        		len--;
        	}
        }
        while(headA!=null && headB!=null) {
        	if(headA==headB) {
        		res = headA;
        		break;
        	}
        	else {
        		headA = headA.next;
        		headB = headB.next;
        	}
        }
        return res;
    }

}
