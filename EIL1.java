package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class EIL1 {
public static void main(String[] args) {
	
	Vector v =new Vector();
	Enumeration e=v.elements();
	System.out.println(v.getClass().getName());//java.util.Vector
	System.out.println(e.getClass().getName());//java.util.Vector$1(annonymous inner class)
	
	ArrayList a=new ArrayList();
	Iterator itr=a.iterator();
	System.out.println(a.getClass());//class java.util.ArrayList
    System.out.println(a.getClass().getName());//java.util.ArrayList
    System.out.println(itr.getClass().getName());//java.util.ArrayList$Itr
    
    LinkedList l=new LinkedList();
    ListIterator litr=l.listIterator();
    System.out.println(l.getClass().getName());//java.util.LinkedList
    System.out.println(litr.getClass().getName());//java.util.LinkedList$ListItr
}
}
