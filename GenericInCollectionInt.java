package interview.collection.GenericInCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericInCollectionInt {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();//using integer
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		 for(Integer i:al)                      //using for
		 {
			 System.out.println(i);
		 }
		 
		 int a=al.get(0);                      //using get method
		 System.out.println(a);
		 int a2=al.get(01);                      
		 System.out.println(a2);
		 int a3=al.get(02);                      
		 System.out.println(a3);
		 int a4=al.get(03);                     
		 System.out.println(a4);
		
		List<String> al1=new ArrayList<String>();//using string
		al1.add("vijay");
		al1.add("mane");
		al1.add("successfully");
		al1.add("palced");
		
		Iterator itr=al1.iterator();             //using iterator
		
		while(itr.hasNext()) {
		String a1 	=(String)itr.next();
		System.out.println(a1);
		}
		
		
		
		
		
		
	}
}
