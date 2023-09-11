package cjcPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInstanceOf {
	
	public static void main(String[] args) {
		
		List<Object>l=new ArrayList<>();
		l.add(1);
		l.add(2.0);
		l.add(true);
		l.add("u r in");
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			Object a=itr.next();
			System.out.println(a);
			
			if(a instanceof Integer) {System.out.println(a);}
//			Integer b=(Integer)itr.next();
//			System.out.println("Integer"+b);
//			float c=(float)itr.next();
//			System.out.println("float"+c);
//			boolean d=(boolean)itr.next();
//			System.out.println("boolean"+d);
//			String s=(String)itr.next();
//			System.out.println(s);
			
		}
	}

}
