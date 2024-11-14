package question2;


public class Queue
{
	private LinkedList list;
	
	public Queue()
	{
		list=new LinkedList();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public void push(int value)
	{
		list.addLast(value);
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
