package question2;



public class QueueLinkedListTest {

	public static void main(String[] args) {
		
		Queue q=new Queue();
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		
		System.out.println("Peeked Data : " + q.peek());
		q.pop();
		System.out.println("Peeked Data : " + q.peek());
		q.pop();
		System.out.println("Peeked Data : " + q.peek());

	}

}
