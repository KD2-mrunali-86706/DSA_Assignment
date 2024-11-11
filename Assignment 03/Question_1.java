package assignment;


import java.util.Stack;

public class Question_1 
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		int arr[]=new int[5];
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=(int) s.pop();
			System.out.println("element is pop "+arr[i]);
		}
		
		//System.out.println("peek element are  " +s.peek());
		
	}
}
