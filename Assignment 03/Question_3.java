package assignment;
import java.util.Scanner;



 
 
 
 

 class SinglyLinearList 
{
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
	private Node head;
	
	public SinglyLinearList()
	{
		head=null;
		
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		
		Node newnode=new Node(value);
		
		
		newnode.next=head;
		
		
		head=newnode;
	}
	
	public void addLast(int value)
	{
		
		Node newnode=new Node(value);
		
		
		if(isEmpty())
			
			
			head=newnode;
		
		
		else 
		{
			Node trav=head;
			
			
			while(trav.next!=null)
				trav=trav.next;
			trav.next=newnode;
		}
	}
	
	public void display()
	{
		Node trav=head;
		while(trav!=null)
			{
			System.out.println(" " +trav.data);
			trav=trav.next;
	
			}
	}
}

 
 
 
 
 
 
public class Question_3 {

	public static void main(String[] args) {
		SinglyLinearList s=new SinglyLinearList();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=3)
		{
			System.out.println("1. insert a new data after a given data \n2. insert a new data before a given data ");
			System.out.print("Enter choices ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("enter value ");
				int value=sc.nextInt();
				s.addFirst(value);
				s.display();
				break;
				
			case 2:
				System.out.print("enter value ");
				int value1=sc.nextInt();
				s.addLast(value1);
				s.display();
				break;
			}
		}

	}

}
