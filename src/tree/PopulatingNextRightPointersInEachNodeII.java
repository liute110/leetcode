package tree;

import java.util.LinkedList;
import java.util.Queue;
public class PopulatingNextRightPointersInEachNodeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
    public void connect(TreeLinkNode root) {
    	if(root==null) return;
    	Queue<TreeLinkNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()) {
        	int n = que.size();
        	TreeLinkNode cur = que.poll();
        	if(cur.left!=null) que.offer(cur.left);
        	if(cur.right!=null) que.offer(cur.right);
        	TreeLinkNode next = null;
        	for(int i=0; i<n-1; i++) {
        		next = que.poll();
        		cur.next = next;
        		if(next.left!=null) que.offer(next.left);
        		if(next.right!=null) que.offer(next.right);
        		cur = next;
        	}
        }
    }

}
