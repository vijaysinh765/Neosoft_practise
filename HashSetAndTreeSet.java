package interview.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet {
public static void main(String[] args) {
	
	Set s=new HashSet();
	s.add("abc");
	s.add("ijk");
	s.add("xyz");
	
//	s.forEach(System.out::println);         //forEach in set
//	s.forEach(a->System.out.println(a));    //forEach in set using lambda expression
	
//	Iterator itr=s.iterator();              // iterator in set
//	while(itr.hasNext()) {
//		String a=(String)itr.next();
//		System.out.println(a);
//	}
	
//	for(Object a :s)                      //for in set
//	{           
//		String b=(String) a;
//		System.out.println(b);
//	}
	
	Set s1=new TreeSet();                //treeSet
	s1.add("def");
	s1.add("ghi");
	s1.add("jkl");
	
//	Iterator itr=s1.iterator();         //iterator in treeSet
//	while(itr.hasNext()){
//		String a=(String)itr.next();
//		System.out.println(a);
//		}
	
//	for(Object m:s1) {                 //for in treeSet
//		String a=(String)m;
//		System.out.println(a);
//	}
	
	//s1.forEach(System.out::println);  //forEach
	s1.forEach(a->System.out.println(a));//forEach using lambda expression
	
}
}
