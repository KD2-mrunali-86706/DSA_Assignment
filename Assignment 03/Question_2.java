package assignment;

import java.util.Scanner;

class Queue 
{
	private int arr[];
	private int front,rear;
	private final int SIZE;
	int count=0;
	
	public Queue(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		front=rear=-1;
	}
	
	public void push(int value)
	{
		count++;
		 rear=(rear+1)%SIZE;
		arr[rear]=value;
	}
	public int pop()
	{
		count--;
		int temp=arr[(front+1)%SIZE];
		front=(front+1)%SIZE;
		if(front==rear)
			front=rear=-1;
		return temp;
	}
	public int peek()
	{
		return arr[(front+1)%SIZE];
	}
	public boolean isFull()
	{
		
		return (front==-1 && rear==SIZE-1 && count==SIZE) || (front ==rear &&rear !=-1);
	}
	public boolean isEmpty()
	{
		
		return (front==rear && rear ==-1 && count==0);
	}
	
}

public class Question_2 {

	public static void main(String[] args) {
		Queue q=new Queue(4);
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=4)
		{
			System.out.println("1.push \n2.pop \n3.peek \n4.exit \n Enter your choices ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(q.isFull())
					System.out.println("Queue is full ");
				else
					System.out.print("enter value ");
				    int value=sc.nextInt();
				    q.push(value);
				    System.out.println("Count is "+q.count);
				break;
				
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty ");
				else
					System.out.println("Pop element "+q.pop());
					System.out.println("Count is "+q.count);
				break;
				
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty ");
				else
					System.out.println("Peek elemnet is " +q.peek());
				break;
			}
		}

	}

}
