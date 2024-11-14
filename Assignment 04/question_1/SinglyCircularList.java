package question1;


public class SinglyCircularList {

	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	private Node head,tail;
	
	private int size;
	public SinglyCircularList()
	{
		head=tail=null;
		size=0;
	}
	//trav.next.next
	
	public boolean isEmpty()
	{
		return  tail==null;
	}
	public void addFirst(int value)
	{
		//1.create newnode
		Node newnode=new Node(value);
		
		//2.id list is empty
		if(isEmpty())
		{
		    head=tail=newnode;
		    tail.next=tail;
	    }
		
		//3.if list is not empty
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode=new Node(value);
		
		if(isEmpty())
		{
			head=tail=newnode;
			tail.next=tail;
		}
		//3.if list is not empty
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;

			tail=newnode;
		}
	}

	public void addPosition(int value, int pos) {
		//0. validate the position
		if(pos < 1 || pos > size + 1)
			return;
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(size == 0) {
			head = tail = newnode;
			tail.next = tail;
		}
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else if(pos == size + 1) {
			addLast(value);
			return;
		}
		//3. if list is not empty
		else {

			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		size++;
	}
	
	public void deleteFirst()
	{
		if(size==0)
			return;
		else if(size==1)
			tail=null;
		else
		{
			tail.next=tail.next.next;
		}
	}
	
//	public void deleteLast()
//	{
//		if(size==0)
//			return;
//		else if(size==1)
//			head=tail=null;
//		else
//		{
//			Node trav=tail.next;
//			while(trav.next!=tail)
//				trav=trav.next;
//			trav.next=tail.next;
//			tail=trav;
//		}
//	}
	public void display()
	{
		Node trav=tail.next;
		do {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}while(trav!=tail.next);
		System.out.println();
	}
	
}

