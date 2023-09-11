package cjcPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList11 {
	public static void main(String[] args) {
		
		List <Integer>l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		int a=l.get(0);
		System.out.println("get method output :"+a);
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			
			Integer b=(Integer)itr.next();
			System.out.println(b);
		}
	}

}
