package question2;



public class StackLinkedListTest {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(11);
		s.push(21);
		s.push(35);
		s.push(41);
		s.push(51);
		
		s.pop();
		System.out.println("Peeked Data : " + s.peek());
		
		s.pop();
		System.out.println("Peeked Data : " + s.peek());
	}

}

