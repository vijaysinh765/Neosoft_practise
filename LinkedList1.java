package collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		l.add("Durga");
		l.add(30);
		l.add(null);
		l.add("Durga");
		l.add("complete");
		System.out.println(l);
		System.out.println(l.get(0));//get
		System.out.println(l.getFirst());;//getFirst
		System.out.println(l.getLast());//getLast()
		l.addFirst("java");          //addFirst
		System.out.println(l);
		l.addLast("success");        //addLast
		System.out.println(l);
		l.removeFirst();             //removeFirst()
		System.out.println(l);
		l.removeLast();              //removeLast()
		System.out.println(l);
		l.set(0, 1);                 //set()
		System.out.println(l);
		
	}

}
