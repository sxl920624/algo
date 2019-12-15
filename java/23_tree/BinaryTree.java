public class BinaryTree{
	
	public static class Node {
		
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node tree;
	
	//前序遍历
	public void preOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.println(root.data);
		
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//中序遍历
	public void inOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	//后序遍历
	public void postOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}