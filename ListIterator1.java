package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("balakrishna");                      //add()
		l.add("venky");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator itr=l.listIterator();        //Iterator&iterator()-Read,Retrieve,Remove,Add-only available to list
		while(itr.hasNext()) {                    //hasNext()
		String s	=(String)itr.next();          //next()
		//System.out.println(s);
		if(s.equals("venky")) {itr.remove();}     //remove()-
		if(s.equals("chiru")) {itr.set("charan");}//set()-replace an object with new object
		if(s.equals("nag")) {itr.add("ajgar");}   //add()
		}
		System.out.println(l);
	}
}
