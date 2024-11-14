package question2;


public class Stack 
{
	private LinkedList list;
	
	public Stack()
	{
		list=new LinkedList();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public void push(int value)
	{
		list.addFirst(value);
	}
	public void pop()
	{
		list.deleteFirst();
	}
	public int peek()
	{
		return list.getHead();
	}
}

