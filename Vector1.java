package collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		System.out.println(v.capacity());
		
		for(int i=0;i<=9;i++) {
		v.add(i);}                             //add
	
		System.out.println(v.capacity());      //capacity
		System.out.println(v);
		v.addElement(6);                       //addElement
		System.out.println(v.capacity());
		System.out.println(v);
		v.addElement("a");
		System.out.println(v);
		System.out.println(v.size());          //size()
		System.out.println(v.capacity()); 
		System.out.println(v.elementAt(11));   //elementAt()
		System.out.println(v.firstElement());  //firstElement()
		System.out.println(v.lastElement());   //lastElement()
		v.removeElement(6);                    //removeElement()
		System.out.println(v);
		v.removeElementAt(1);                  //removeElementAt()
		System.out.println(v);
		v.removeAllElements();                 //removeAllElements
		System.out.println(v);

}}
