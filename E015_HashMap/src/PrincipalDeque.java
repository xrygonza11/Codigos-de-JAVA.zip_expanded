import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class PrincipalDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> deque= new LinkedList<String>();
		
		deque.addFirst("primero");
		deque.add("segundo");
		deque.addLast("tercero");
		
		deque.offerLast("cuarto");
		deque.offerFirst("quinto");
		deque.offer("sexto");
		
		deque.push("septimo");
		
		
		Iterator iter= deque.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());//obtención del elemento
		}

		deque.pop();
		
		System.out.println("------");
		
		
		Iterator iter2= deque.iterator();
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());//obtención del elemento
		}
	}

}
