package question2;



public class LinkedList {
	static class Node
	{
		private int data;
		private Node next;
		public Node(int vlaue)
		{
			data=vlaue;
			next=null;
		}
	}
	private Node head,tail;
	private int size;
	public LinkedList()
	{
		head=tail=null;
		size=0;
	}
	
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	
	
	public int getHead() {
		return head.data;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addFirst(int value)
	{
		//1.create newnode
		Node newnode=new Node(value);
		
		//2.id list is empty
		if(isEmpty())
		{	
			//a.add newnode head and tail
			head=tail=newnode;
		   //b.make list circular
		   tail.next=head;
		}
		//3.if list is not empty
	   else
	   { 
		   //a.add 1st node into next of newnode
		  newnode.next=head;   
		  
		  //b.add newode into next of last node
		  tail.next=newnode;
		  
		  //c.move head on newnode
		  head=newnode;
	   }
		
		size++;
	}
	
	public void addLast(int value)
	{
		
		//1.create new node
		Node newnode=new Node(value);
		
		//2.if list is empty
		if(isEmpty())
		{
			//a.add newnode into head nad tail
			head=tail=newnode;
			
			//b.make list is circular
			tail.next=head;
		}
			
		//3.if list is not empty
		else
		{
			//a.add first node into next of newnode
			newnode.next=head;
			
			//b.add newnode into next of last node
			tail.next=newnode;
			
			//c.move tail on last node
			tail=newnode;
		}
		size++;
	}
	
	public void addAtPosition(int value,int pos)
	{
		if(pos<1 || pos>size+1)
			return;
		//1.create node
		Node newnode=new Node(value);
		
		//2.if list is empty
		if(isEmpty())
		{
			//a.add newnode into head and tail
			head=tail=newnode;
			
			//b.make list is circular
			tail.next=head;
		}
		else if(pos==1)
			addFirst(value);
		
		else if(pos==size+1)
			addLast(value);
		//3.if list is not empty
		else
		{	
			Node trav=head;
			
			//a.trav till pos-1 node
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			
			//b.add pos node into next of newnode
			newnode.next=trav.next;
			
			//c.add newnode into next of pos-1 node
			trav.next=newnode;
		}		
		size++;
	}
	
	public void deleteFirst()
	{
		//1.list is empty
				if(isEmpty())
					return;
				
				//2.if list has single element then head=tail=null;
				else if(size==1)
					head=tail=null;
				
				//3.list has multiple element
				else
					
					//a.add 2nd node into next of last node
					tail.next=head.next;
					
					//b.move head on 2nd node
					head=head.next;
					
					size--;
	}
	
	public void deleteLast()
	{
		//1.if list is empty return
		if(isEmpty())
			return;
		
		//2.if list has a single node head=tail=null
		else if(size==1)
			head=tail=null;
		
		//3.if list has multiple node
		else
		{
			Node trav=head;
		//a.traverse till 2nd last node
			while(trav.next.next!=head)
				trav=trav.next;
			
		//b.add 1st node into next of 2nd last node
			trav.next=head;
		//c.move tailon 2nd last node
			tail=trav;
		}
		size--;
	}

	public void deleteAtPosition(int pos)
	{
		if(pos<1 || pos >size)
			return;
		//1.if list is empty return
		if(isEmpty())
			return; 
		
		else if(pos==1)
		{
			deleteFirst();
			return;
		}
		else if(pos==size)
		{
			deleteLast();
		    return;
		}
		//2.if list has a single node head=tail=null
		else if(head.next==head)
			head=tail=null;
		
		//3.if list has multiple node
		else
		{
			Node trav=head;
			//a.traverse till pos-1  node
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			//b.add pos+1 node into next of 2nd last node
			trav.next=trav.next.next;
		}
	}
	
	public void display()
	{
		Node trav=head;
		do
		{
			System.out.print(" ,"+trav.data);
			trav=trav.next;
		}while(trav!=head);
		System.out.println();
	}
	
	public void deleteAll()
	{
		head=tail=null;
		size=0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}
