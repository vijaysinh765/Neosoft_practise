package collection;

import java.util.Comparator;

public class ComparatorSortingStringBufferTest implements Comparator{
public int compare(Object obj1,Object obj2){
	
	String s1=obj1.toString();
	String s2=obj2.toString();
	//return s1.compareTo(s2);//DNSO-[A, K, L, Z]
	return s2.compareTo(s1); //[Z, L, K, A]
	
}
}
