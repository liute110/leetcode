package LinkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head==null) return null;
    	RandomListNode newHead = new RandomListNode(head.label);
    	RandomListNode ph = head;
    	RandomListNode pn = newHead;
    	Map<RandomListNode,RandomListNode> map = new HashMap<>();
    	map.put(ph, pn);
    	while(ph.next!=null) {
    		pn.next = new RandomListNode(ph.next.label);
    		pn = pn.next;
    		ph = ph.next;
    		map.put(ph, pn);
    	}
    	ph = head;
    	pn = newHead;
    	while(ph!=null && pn!=null) {
    		pn.random = map.get(ph.random);
    		pn = pn.next;
    		ph = ph.next; 
    	}
    	return newHead;
    	
    }

}
