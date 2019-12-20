public class BinarySearchTree {
	
	private Node tree;
	
	public static class Node {
		
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node find(int data) {
		
		Node p = tree;
		
		while(p != null) {
			
			if(p.data < data) {
				p = p.right;
			}else (p.data > data) {
				p = p.left;
			}else {
				return p;
			}
		}
		
		return null;
	}
	
	public void insert(int data) {
		
		if(tree == null) {
			tree = new Node(data);
			return;
		}
		
		Node p = tree;
		
		while(p != null) {
			
			if(data > p.data) {
				
				if(p.right == null) {
					p.right = new Node(data);
					return;
				}
				
				p = p.right;
			} else {
				
				if(p.left == null) {
					
					p.left = new Node(data);
					return;
				}
				
				p = p.left;
			}
		}
		
		public void delete(int data) {
			
			Node p = tree;
			
			// pp记录的是p的父节点
			Node pp = null;
			
			//先找到等于要查找的值得节点
			while(p != null && p.data != data) {
				
				pp = p;
				
				if(data > p.data) {
					
					p = p.right;
				} else {
					
					p = p.left;
				}
			}
			
			if(p == null) {
				return;
			}
			
			// 如果该节点有左右子节点，找到右子节点中最小的节点
			if(p.left != null && p.right != null) {
				
				Node minP = p.right;
				
				//表示minP的父节点
				Node minPP = p;
				
				while(minP.left != null) {
					
					minPP = minP;
					minP = minP.left;
				}
				
				//替换右子节点中最小的节点的值到p中
				p.data = minP.data;
				
				//删除minP
				p = minP;
				pp = minPP;
			}
			
			//删除节点是叶子节点或者仅有一个子节点
			
			//p的子节点
			Node child;
			
			if(p.left != null) {
				child = p.left;
			}else if(p.right != null) {
				child = p.right;
			}else{
				child = null;
			}
			
			if(pp == null) {
				tree = child;
			} else if (pp.left == p) {
				pp.left = child;
			} else {
				pp.right = child;
			}
		}
		
		
	}
	
	public Node findMin() {
		
		if(tree == null) {
			
			return null;
		}
		
		Node p = tree;
		
		while(p.left != null) {
			p = p.left;
		}
		
		return p;
	}
	
	public Node findMax() {
		
		if(tree == null) {
			return null;
		}
		
		Node p = tree;
		
		while(p.right != null) {
			
			p = p.right;
		}
		
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}