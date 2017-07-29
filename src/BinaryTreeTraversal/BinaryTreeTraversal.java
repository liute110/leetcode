package BinaryTreeTraversal;

import java.util.List;
import java.util.Stack;

import tree.TreeNode;

public class BinaryTreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.right = t4;
		t4.right = t5;
		BinaryTreeTraversal btt = new BinaryTreeTraversal();
		btt.postorderTraversal(root);
		

	}
	
	
	public void preorderTraversal(TreeNode root) {
		if(root==null) return;
		Stack<TreeNode> s = new Stack<>();
		TreeNode cur = root;
		while(!s.isEmpty() || cur!=null) {
			if(cur!=null) {
				System.out.println(cur.val);
				s.push(cur);
				cur = cur.left;
			}else {
				cur = s.pop();
				cur = cur.right;
			}
		}
	}
	
	public void inorderTraversal(TreeNode root) {
		if(root==null) return;
		Stack<TreeNode> s = new Stack<>();
		TreeNode cur = root;
		while(!s.isEmpty() || cur!=null) {
			if(cur!=null) {
				s.push(cur);
				cur = cur.left;
			}else{
				cur = s.pop();
				System.out.println(cur.val);
				cur = cur.right;
			}
		}
	}
	
	
	/*
	public void postorderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		TreeNode cur = root;
		TreeNode pre = cur;
		boolean flag = true;
		while(cur!=null || !s.isEmpty()) {
			if(cur!=null && flag) {
				s.push(cur);
				cur = cur.left;
			}else {	
				if(s.isEmpty()) return;
				cur = s.peek();
				if(cur.right!=null && cur.right!=pre) {
					cur = cur.right;
					flag = true;
				}else {
					cur = s.pop();
					System.out.println(cur.val);
					flag = false;
					pre = cur;
				}
				
			}
		}
		
	}
	*/
	
	public void postorderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		TreeNode cur = root;
		TreeNode pre = cur;
		boolean flag = true;
		while(cur!=null || !s.isEmpty()) {
			if(cur!=null && flag) {
				s.push(cur);
				cur = cur.left;
			}else {
				if(s.isEmpty()) return;
				cur = s.peek();
				if(cur.right!=null && cur.right!=pre) {
					cur = cur.right;
					flag = true;
				}else {
					cur = s.pop();
					System.out.println(cur.val);
					pre = cur;
					flag = false;
				}
			}
		}
		
	}
	
	
	

}
