package tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class SerializeandDeserializeBST {

	public SerializeandDeserializeBST() {
		// TODO Auto-generated constructor stub
	}
	
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root==null) return "";
    	StringBuffer res = new StringBuffer();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur!=null) {
        	if(cur!=null) {
        		res.append(cur.val).append(" ");
        		stack.push(cur);
        		cur = cur.left;
        	}else {
        		cur = stack.pop();
        		cur = cur.right;
        	}
        }
        return res.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.length()==0) return  null;
        String[] nodes = data.split(" ");
        Queue<Integer> que = new LinkedList<>();
        for(String s:nodes) {
        	que.offer(Integer.valueOf(s));
        }
        return buildTree(que);
    }
    
    
    public TreeNode buildTree(Queue<Integer> que) {
    	if(que.isEmpty()) return null;
    	TreeNode root = new TreeNode(que.poll());
    	Queue<Integer>  leftNodeVals = new LinkedList<>();
    	while(!que.isEmpty() && que.peek()<=root.val) {
    		leftNodeVals.offer(que.poll());
    	}
    	root.left = buildTree(leftNodeVals);
    	root.right = buildTree(que);
    	return root;
    }

}
