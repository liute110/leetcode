package LinkedList;

import java.util.LinkedList;



public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode oddEvenList(ListNode head) {
        if(head!=null) {
        	ListNode odd = head;
        	ListNode even = head.next;
        	ListNode tmp = even;
        	while(even!=null && even.next!=null) {
        		odd.next = even.next;
        		odd = odd.next;
        		even.next = odd.next;
        		even = even.next;
        	}
        	odd.next = tmp;
        }   
        return head;
    }

}
