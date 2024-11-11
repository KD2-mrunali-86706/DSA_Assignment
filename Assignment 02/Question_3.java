package com.sunbeam;

import java.util.Scanner;

class LinearQueue 
{
	private int arr[];
	private int front,rear;
	private final int SIZE;
	
	public LinearQueue(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		front=rear=0;
	}
	
	public void push(int value)
	{
		rear++;
		arr[rear]=value;
	}
	public int pop()
	{
		int temp=arr[front+1];
		front++;
		return temp;
	}
	public int peek()
	{
		return arr[front+1];
	}
	public boolean isFull()
	{
		return rear==SIZE-1;
	}
	public boolean isEmpty()
	{
		return front==rear;
	}
}


public class Question_3 {

	public static void main(String[] args) {
		LinearQueue l=new LinearQueue(4);
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=4)
		{
			System.out.println("1.push  \n2.pop \n3.peek ");
			System.out.print("Enter choices ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(l.isFull())
					System.out.println("Queue is full ");
				else
					System.out.print("Enter value ");
				    int value=sc.nextInt();
				    l.push(value);
				break;
				
			case 2:
				if(l.isEmpty())
					System.out.println("Queue is empty ");
				else
					System.out.println("Element is poped " +l.pop());
				break;
				
			case 3:
				if(l.isEmpty())
					System.out.println("Queue is empty ");
				else
					System.out.println("Peek element is " +l.peek());
				break;
			}
		}
		sc.close();

	}

}
