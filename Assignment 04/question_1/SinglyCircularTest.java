package question1;


public class SinglyCircularTest {

	public static void main(String[] args) {
		
		SinglyCircularList s=new SinglyCircularList();
		
		s.addFirst(10);
		s.addFirst(20);
		s.addFirst(30);
		s.addLast(40);
		s.addLast(50);
		s.addLast(60);
		s.display();
		s.deleteFirst();
		
		//s.deleteLast();
		s.addPosition(60,3);
		s.addPosition(70,4);
		
		s.display();
	}

}

