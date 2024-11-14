package assignment;



public class ass5_Q1 {

	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data=value;
			left=right=null;
			
		}
		
	}
	
	private Node root;
	public ass5_Q1() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	
	/*---------------------------------add node using recursion------------------------*/
	public void addNode(int value) {
	if(root==null)
		root=new Node(value);
	else
		addNode(value,root);
		
		
	}
		
	
	
	
	public void addNode(int value,Node trav) {
		
		if(value<trav.data) {
			if(trav.left==null) {
				trav.left=new Node(value);
				
			}
			else {
				addNode(value,trav.left);
			}
		}
	
			else 
				{
				if(trav.right==null) {
				
				trav.right=new Node(value);
				return;
			}
			else 
		{
				addNode(value,trav.right);
		}
			

				}

	}
		
		
		
		
		
		
		
		
		
		
	
	/*----------------------------------display----------------------------------------*/
		private  void preOrder(Node trav) {
			if(trav==null)
				return;
			System.out.print(" "+trav.data);
			preOrder(trav.left);
			preOrder(trav.right);
			
			
			
		}
		
		public void preOrder() {
			System.out.print("preorder of tree is : ");
			preOrder(root);
			System.out.println();
			
			
		}
	
	
	
	
	public void deleteAll() {
		root=null;
	}
	
	
	public static void main(String[] args) {
		ass5_Q1 bst=new ass5_Q1();
		
		bst.addNode(8);
		bst.addNode(12);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(5);
		bst.addNode(6);
		bst.addNode(15);
		bst.addNode(14);
		bst.addNode(7);
		bst.addNode(9);
		bst.preOrder();
	
	
	
	
	}
}
