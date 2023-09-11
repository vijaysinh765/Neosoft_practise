package collection;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add("A");
	l.add(2);
	l.add("A");
	l.add(null);                   //add()
	System.out.println(l);
	
	System.out.println(l.get(1)); // get()
	l.remove(2);                  //remove()
	System.out.println(l);
	l.add(2,"B");                 //add(index,object)
	System.out.println(l);
	System.out.println(l.size()); //size()
	System.out.println(l.addAll(l));//addAll
	System.out.println(l.contains("A"));//contains()
	System.out.println(l.containsAll(l));//containsAll()
	System.out.println(l.isEmpty());     //isEmpty()
	System.out.println(l.retainAll(l));//retainAll-remove all object except those present in collection
	l.clear();                         //clear()
	System.out.println(l);
	System.out.println(l.addAll(l));
}
}
